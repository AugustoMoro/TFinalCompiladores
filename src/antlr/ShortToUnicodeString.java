/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antlr;

import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 *
 * @author augusto
 */
public class ShortToUnicodeString extends automatoBaseListener {

    private ArrayList<String> terminais;
    private boolean error;
    public ShortToUnicodeString(){
        this.terminais = new ArrayList<String>();
        this.error = false;
    }
    @Override
    public void enterExprAutomato(automatoParser.ExprAutomatoContext ctx) {
    }

    @Override
    public void exitExprAutomato(automatoParser.ExprAutomatoContext ctx) {
    }

    @Override
    public void enterEstadosExp(automatoParser.EstadosExpContext ctx) {
    }

    @Override
    public void exitEstadosExp(automatoParser.EstadosExpContext ctx) {
    }

    @Override
    public void enterEstados(automatoParser.EstadosContext ctx) {
    }

    @Override
    public void exitEstados(automatoParser.EstadosContext ctx) {
    }

    @Override
    public void enterAlfabetoExp(automatoParser.AlfabetoExpContext ctx) {
    }

    @Override
    public void exitAlfabetoExp(automatoParser.AlfabetoExpContext ctx) {
    }

    @Override
    public void enterAlfabeto(automatoParser.AlfabetoContext ctx) {
    }

    @Override
    public void exitAlfabeto(automatoParser.AlfabetoContext ctx) {
    }

    @Override
    public void enterTransicaoExp(automatoParser.TransicaoExpContext ctx) {
    }

    @Override
    public void exitTransicaoExp(automatoParser.TransicaoExpContext ctx) {
    }

    @Override
    public void enterTransicao(automatoParser.TransicaoContext ctx) {
    }

    @Override
    public void exitTransicao(automatoParser.TransicaoContext ctx) {
    }

    @Override
    public void enterEstadoInicial(automatoParser.EstadoInicialContext ctx) {
    }

    @Override
    public void exitEstadoInicial(automatoParser.EstadoInicialContext ctx) {
    }

    @Override
    public void enterEstadoFinal(automatoParser.EstadoFinalContext ctx) {
    }

    @Override
    public void exitEstadoFinal(automatoParser.EstadoFinalContext ctx) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        terminais.add(node.getText());
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        this.error = true;
    }
    
    public ArrayList<String> getTerminais() {
        if(!error)
            return terminais;
        return null;
    }
    
    

}
