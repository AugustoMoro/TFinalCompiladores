/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfinal;

import automato.Estado;
import automato.Transicao;
import java.util.ArrayList;

/**
 *
 * @author augusto
 */
public class TerminaisOrganizados {

    private ArrayList<Estado> estadosAutomato;
    private ArrayList<String> estados;
    private ArrayList<String> alfabeto;
    private ArrayList<String> estadosFinais;
    private ArrayList<Transicao> transicoes;
    private ArrayList<String> terminais;
    private String estadoInicial;
    private boolean afnd;
    private boolean erroEstado;
    private boolean erroAlfabeto;
    private boolean erroEstadoInicial;
    private boolean erroEstadoFinal;

    public TerminaisOrganizados(ArrayList<String> terminais) {
        this.estados = new ArrayList<String>();
        this.alfabeto = new ArrayList<String>();
        this.estadosFinais = new ArrayList<String>();
        this.transicoes = new ArrayList<Transicao>();
        this.terminais = terminais;
        this.afnd = false;
        this.erroEstado = false;
        this.erroAlfabeto = false;
        this.erroEstadoInicial = true;
        this.erroEstadoFinal = true;
        this.estadosAutomato = new ArrayList<Estado>();
        pegaEstados();
        pegaAlfabeto();
        pegaTransicao();
        pegaEstadoInicial();
        pegaEstadosFinais();
        verificaAFND();
        verificaEstados();
        verificaAlfabeto();
        verificaTransicoes();
        convertToEstados();
    }

    private void convertToEstados(){
        for(int i=0; i<estados.size(); i++){
            Estado e = new Estado();
            e.setNomeEstado(estados.get(i));
            if(estadoInicial.equals(estados.get(i)))
                e.seteInicial(true);
            else e.seteInicial(false);
            
            if(estadosFinais.contains(estados.get(i)))
                e.seteFinal(true);
            else e.seteFinal(false);
            
            estadosAutomato.add(e);
        }
    }
    
    private void pegaEstados() {
        while (!terminais.get(0).equals("}")) {
            String s = terminais.get(0);
            if (!s.equals("{") && !s.equals("(") && !s.equals(",") && !s.equals(")") && !s.equals("}")) {
                estados.add(s);
            }
            terminais.remove(0);
        }
        terminais.remove(0);
    }

    private void pegaAlfabeto() {
        while (!terminais.get(0).equals("}")) {
            String s = terminais.get(0);
            if (!s.equals("{") && !s.equals("(") && !s.equals(",") && !s.equals(")") && !s.equals("}")) {
                alfabeto.add(s);
            }
            terminais.remove(0);
        }
        terminais.remove(0);
    }

    private void pegaTransicao() {
        ArrayList<String> arr = new ArrayList<String>();
        boolean teste = false;
        int contaSeparador = 0;
        while (!terminais.get(0).equals("}")) {
            String s = terminais.get(0);
            if (!s.equals("T") && !s.equals("{") && !s.equals("(") && !s.equals(",") && !s.equals(")") && !s.equals("}")) {
                arr.add(s);
                if (teste) {
                    arr.add("#");
                    contaSeparador++;
                    teste = false;
                }
                if (s.equals("=")) {
                    teste = true;
                }
            }
            terminais.remove(0);
        }
        terminais.remove(0);

        while (arr.contains("=")) {
            arr.remove("=");
        }

        for (int i = 0; i < contaSeparador; i++) {
            int pos = arr.indexOf("#");
            Transicao t = new Transicao();
            t.setEstadoAtual(arr.get(pos - 3));
            t.setAlfabetoTransicao(arr.get(pos - 2));
            t.setProximoEstado(arr.get(pos - 1));
            arr.remove(pos);
            pos--;
            arr.remove(pos);
            pos--;
            arr.remove(pos);
            pos--;
            arr.remove(pos);
            transicoes.add(t);
        }
    }

    private void pegaEstadoInicial() {
        while (!terminais.get(0).equals("}")) {
            String s = terminais.get(0);
            if (!s.equals("{") && !s.equals("(") && !s.equals(",") && !s.equals(")") && !s.equals("}")) {
                estadoInicial = s;
            }
            terminais.remove(0);
        }
        terminais.remove(0);
    }

    private void pegaEstadosFinais() {
        while (!terminais.get(0).equals("}")) {
            String s = terminais.get(0);
            if (!s.equals("{") && !s.equals("(") && !s.equals(",") && !s.equals(")") && !s.equals("}")) {
                estadosFinais.add(s);
            }
            terminais.remove(0);
        }
        terminais.remove(0);
    }

    private void verificaAFND() {
        for (int i = 0; i < transicoes.size(); i++) {
            for (int j = 0; j < transicoes.size(); j++) {
                if (i != j) {
                    String e1 = transicoes.get(i).getEstadoAtual();
                    String a1 = transicoes.get(i).getAlfabetoTransicao();
                    String e2 = transicoes.get(j).getEstadoAtual();
                    String a2 = transicoes.get(j).getAlfabetoTransicao();
                    if (e1.equals(e2) && a1.equals(a2)) {
                        afnd = true;
                    }
                }
            }
        }
    }

    private void verificaEstados() {
        if (!estados.contains(estadoInicial)) {
            erroEstado = true;
            return;
        }
        for (int i = 0; i < estadosFinais.size(); i++) {
            if (!estados.contains(estadosFinais.get(i))) {
                erroEstado = true;
                return;
            }
        }
        for (int i = 0; i < transicoes.size(); i++) {
            String eAtual = transicoes.get(i).getEstadoAtual();
            String proxEstado = transicoes.get(i).getProximoEstado();
            if (!estados.contains(eAtual) || !estados.contains(proxEstado)) {
                erroEstado = true;
                return;
            }
        }

        if (!estados.contains(estadoInicial)) {
            erroEstado = true;
            return;
        }

    }

    private void verificaTransicoes() {
        for (int i = 0; i < transicoes.size(); i++) {
            Transicao t = transicoes.get(i);
            if (estadoInicial.equals(t.getEstadoAtual())) {
                erroEstadoInicial = false;
                break;
            }
        }

        for (int i = 0; i < transicoes.size(); i++) {
            Transicao t = transicoes.get(i);
            if (estadosFinais.contains(t.getProximoEstado())) {
                erroEstadoFinal = false;
                break;
            }
        }

    }

    private void verificaAlfabeto() {
        for (int i = 0; i < transicoes.size(); i++) {
            String a = transicoes.get(i).getAlfabetoTransicao();
            if (!alfabeto.contains(a)) {
                erroAlfabeto = true;
                return;
            }
        }
    }

    public boolean isAfnd() {
        return afnd;
    }

    public boolean isErroEstado() {
        return erroEstado;
    }

    public boolean isErroAlfabeto() {
        return erroAlfabeto;
    }

    public boolean isErroEstadoInicial() {
        return erroEstadoInicial;
    }

    public boolean isErroEstadoFinal() {
        return erroEstadoFinal;
    }

    public ArrayList<Estado> getEstadosAutomato() {
        return estadosAutomato;
    }

    public ArrayList<Transicao> getTransicoes() {
        return transicoes;
    }
    
    
    

}
