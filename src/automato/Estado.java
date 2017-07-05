/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automato;

import java.util.ArrayList;

/**
 *
 * @author augusto
 */
public class Estado {
    private boolean eInicial;
    private boolean eFinal;
    private String nomeEstado;
    
    public Estado(){
        this.eFinal = false;
        this.eInicial = false;
    }

    public boolean iseInicial() {
        return eInicial;
    }

    public boolean iseFinal() {
        return eFinal;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void seteInicial(boolean eInicial) {
        this.eInicial = eInicial;
    }

    public void seteFinal(boolean eFinal) {
        this.eFinal = eFinal;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }
    
    
    
}
