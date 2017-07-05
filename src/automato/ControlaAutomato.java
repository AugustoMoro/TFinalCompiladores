/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.ArrayList;
import tfinal.TerminaisOrganizados;

/**
 *
 * @author augusto
 */
public class ControlaAutomato {

    private ArrayList<Estado> estados;
    private ArrayList<Transicao> transicao;

    public ControlaAutomato(TerminaisOrganizados t) {
        this.estados = t.getEstadosAutomato();
        this.transicao = t.getTransicoes();
        String s = "11111";
        executaAutomato(s);
    }

    private void executaAutomato(String entrada) {
        Estado estadoAtual = buscaEstadoInicial();
        for (int i = 0; i < entrada.length(); i++) {
            System.out.print("(" + estadoAtual.getNomeEstado() + ", " + entrada.charAt(i) + ") --> ");
            Transicao t = new Transicao();
            t.setEstadoAtual(estadoAtual.getNomeEstado());
            t.setAlfabetoTransicao("" + entrada.charAt(i));
            estadoAtual = buscaTransicao(t);
            if(estadoAtual == null){
                System.out.println("Palavra não reconhecida " + entrada.charAt(i));
                return;
            }
        }
        if(estadoAtual.iseFinal()){
            System.out.println("Palavra Reconhecida");
        }
    }

    private Estado buscaTransicao(Transicao t) {
        Estado e = null;
        for(int i=0; i<transicao.size(); i++){
            Transicao a = transicao.get(i);
            if(a.getEstadoAtual().equals(t.getEstadoAtual()) && a.getAlfabetoTransicao().equals(t.getAlfabetoTransicao())){
                e = buscaEstado(a.getProximoEstado());
            }
        }
        return e;
    }

    private Estado buscaEstado(String nome){
        for(int i=0; i<estados.size(); i++){
            if(estados.get(i).getNomeEstado().equals(nome))
                return estados.get(i);
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
