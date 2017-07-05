/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

/**
 *
 * @author augusto
 */
public class Transicao {
    private String estadoAtual;
    private String alfabetoTransicao;
    private String proximoEstado;

    public String getEstadoAtual() {
        return estadoAtual;
    }

    public String getAlfabetoTransicao() {
        return alfabetoTransicao;
    }

    public String getProximoEstado() {
        return proximoEstado;
    }

    public void setEstadoAtual(String estadoAtual) {
        this.estadoAtual = estadoAtual;
    }

    public void setAlfabetoTransicao(String alfabetoTransicao) {
        this.alfabetoTransicao = alfabetoTransicao;
    }

    public void setProximoEstado(String proximoEstado) {
        this.proximoEstado = proximoEstado;
    }
    
    
}
