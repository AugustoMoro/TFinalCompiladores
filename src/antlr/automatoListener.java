package antlr;
// Generated from automato.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link automatoParser}.
 */
public interface automatoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link automatoParser#exprAutomato}.
	 * @param ctx the parse tree
	 */
	void enterExprAutomato(automatoParser.ExprAutomatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#exprAutomato}.
	 * @param ctx the parse tree
	 */
	void exitExprAutomato(automatoParser.ExprAutomatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#estadosExp}.
	 * @param ctx the parse tree
	 */
	void enterEstadosExp(automatoParser.EstadosExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#estadosExp}.
	 * @param ctx the parse tree
	 */
	void exitEstadosExp(automatoParser.EstadosExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#estados}.
	 * @param ctx the parse tree
	 */
	void enterEstados(automatoParser.EstadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#estados}.
	 * @param ctx the parse tree
	 */
	void exitEstados(automatoParser.EstadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#alfabetoExp}.
	 * @param ctx the parse tree
	 */
	void enterAlfabetoExp(automatoParser.AlfabetoExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#alfabetoExp}.
	 * @param ctx the parse tree
	 */
	void exitAlfabetoExp(automatoParser.AlfabetoExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void enterAlfabeto(automatoParser.AlfabetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#alfabeto}.
	 * @param ctx the parse tree
	 */
	void exitAlfabeto(automatoParser.AlfabetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#transicaoExp}.
	 * @param ctx the parse tree
	 */
	void enterTransicaoExp(automatoParser.TransicaoExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#transicaoExp}.
	 * @param ctx the parse tree
	 */
	void exitTransicaoExp(automatoParser.TransicaoExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#transicao}.
	 * @param ctx the parse tree
	 */
	void enterTransicao(automatoParser.TransicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#transicao}.
	 * @param ctx the parse tree
	 */
	void exitTransicao(automatoParser.TransicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#estadoInicial}.
	 * @param ctx the parse tree
	 */
	void enterEstadoInicial(automatoParser.EstadoInicialContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#estadoInicial}.
	 * @param ctx the parse tree
	 */
	void exitEstadoInicial(automatoParser.EstadoInicialContext ctx);
	/**
	 * Enter a parse tree produced by {@link automatoParser#estadoFinal}.
	 * @param ctx the parse tree
	 */
	void enterEstadoFinal(automatoParser.EstadoFinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link automatoParser#estadoFinal}.
	 * @param ctx the parse tree
	 */
	void exitEstadoFinal(automatoParser.EstadoFinalContext ctx);
}