/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import GUI.Saida;
import java.util.ArrayList;
import tfinal.TerminaisOrganizados;

/**
 *
 * @author augusto
 */
public class ControlaAutomato {

    private ArrayList<Estado> estados;
    private ArrayList<Transicao> transicao;
    private String palavra;

    public ControlaAutomato(TerminaisOrganizados t, String palavra) {
        this.estados = t.getEstadosAutomato();
        this.transicao = t.getTransicoes();
        this.palavra = palavra;
        executaAutomato(palavra);
    }

    private void executaAutomato(String entrada) {
        String transicoes = "";
        Estado estadoAtual = buscaEstadoInicial();
        int posicao = 0;
        for (int i = 0; i < entrada.length(); i++) {
            posicao = i;
            transicoes += "(" + estadoAtual.getNomeEstado() + ", " + entrada.charAt(i) + ")\n";
            Transicao t = new Transicao();
            t.setEstadoAtual(estadoAtual.getNomeEstado());
            t.setAlfabetoTransicao("" + entrada.charAt(i));
            estadoAtual = buscaTransicao(t);
            if (estadoAtual == null) {
                transicoes += "Palavra não reconhecida: " + entrada.charAt(i) + " Posicao: " + (i + 1) + "\n";
                Saida s = new Saida(transicoes, entrada);
                s.setVisible(true);
                return;
            }
        }
        if (estadoAtual.iseFinal()) {
            transicoes += "Palavra Reconhecida \n";
            Saida s = new Saida(transicoes, entrada);
            s.setVisible(true);
        }
        else if(!estadoAtual.iseFinal()){
            transicoes += "Palavra não reconhecida: " + entrada.charAt(posicao) + " Posicao: " + (posicao + 1) + "\n";
            Saida s = new Saida(transicoes, entrada);
            s.setVisible(true);
        }
    }

    private Estado buscaTransicao(Transicao t) {
        Estado e = null;
        for (int i = 0; i < transicao.size(); i++) {
            Transicao a = transicao.get(i);
            if (a.getEstadoAtual().equals(t.getEstadoAtual()) && a.getAlfabetoTransicao().equals(t.getAlfabetoTransicao())) {
                e = buscaEstado(a.getProximoEstado());
            }
        }
        return e;
    }

    private Estado buscaEstado(String nome) {
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getNomeEstado().equals(nome)) {
                return estados.get(i);
            }
        }
        return null;
    }

    private Estado buscaEstadoInicial() {
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).iseInicial()) {
                return estados.get(i);
            }
        }
        return null;
    }

}
