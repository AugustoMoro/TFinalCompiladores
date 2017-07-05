/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfinal;

import antlr.ShortToUnicodeString;
import antlr.automatoLexer;
import antlr.automatoParser;
import automato.ControlaAutomato;
import java.util.ArrayList;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author augusto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comando = sc.nextLine();
        
        ANTLRInputStream input = new ANTLRInputStream(comando);
        automatoLexer lexer = new automatoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        automatoParser parser = new automatoParser(tokens);
        ParseTree tree = parser.exprAutomato();
        ParseTreeWalker walker = new ParseTreeWalker();
        ShortToUnicodeString s = new ShortToUnicodeString();
        walker.walk(s, tree);
        System.out.println();
        
        ArrayList<String> terminais = s.getTerminais();
        if(terminais != null){
            TerminaisOrganizados t = new TerminaisOrganizados(terminais);
            if(t.isAfnd()){
                System.out.println("Erro: O autômato é não determinístico!");
                return;
            }
            if(t.isErroAlfabeto()){
                System.out.println("Erro: Caractere não contido no alfabeto de entrada!");
                return;
            }
            if(t.isErroEstado()){
                System.out.println("Erro: Estado não contido na lista de estados!");
                return;
            }
            if(t.isErroEstadoInicial()){
                System.out.println("Erro: Transicão sem o estado inicial informado!");
                return;
            }
            if(t.isErroEstadoFinal()){
                System.out.println("Erro: Transições nunca levam a um estado final!");
                return;
            }
            ControlaAutomato ctr = new ControlaAutomato(t);
        }
    }
    
}
