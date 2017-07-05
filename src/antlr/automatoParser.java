package antlr;
// Generated from automato.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class automatoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ALFABETO=8, ESTADOS=9, 
		WS=10;
	public static final int
		RULE_exprAutomato = 0, RULE_estadosExp = 1, RULE_estados = 2, RULE_alfabetoExp = 3, 
		RULE_alfabeto = 4, RULE_transicaoExp = 5, RULE_transicao = 6, RULE_estadoInicial = 7, 
		RULE_estadoFinal = 8;
	public static final String[] ruleNames = {
		"exprAutomato", "estadosExp", "estados", "alfabetoExp", "alfabeto", "transicaoExp", 
		"transicao", "estadoInicial", "estadoFinal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "','", "')'", "'{'", "'}'", "'T'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ALFABETO", "ESTADOS", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "automato.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public automatoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprAutomatoContext extends ParserRuleContext {
		public EstadosExpContext estadosExp() {
			return getRuleContext(EstadosExpContext.class,0);
		}
		public AlfabetoExpContext alfabetoExp() {
			return getRuleContext(AlfabetoExpContext.class,0);
		}
		public TransicaoExpContext transicaoExp() {
			return getRuleContext(TransicaoExpContext.class,0);
		}
		public EstadoInicialContext estadoInicial() {
			return getRuleContext(EstadoInicialContext.class,0);
		}
		public EstadoFinalContext estadoFinal() {
			return getRuleContext(EstadoFinalContext.class,0);
		}
		public ExprAutomatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAutomato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterExprAutomato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitExprAutomato(this);
		}
	}

	public final ExprAutomatoContext exprAutomato() throws RecognitionException {
		ExprAutomatoContext _localctx = new ExprAutomatoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exprAutomato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			estadosExp();
			setState(20);
			match(T__1);
			setState(21);
			alfabetoExp();
			setState(22);
			match(T__1);
			setState(23);
			transicaoExp();
			setState(24);
			match(T__1);
			setState(25);
			estadoInicial();
			setState(26);
			match(T__1);
			setState(27);
			estadoFinal();
			setState(28);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadosExpContext extends ParserRuleContext {
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public EstadosExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estadosExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterEstadosExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitEstadosExp(this);
		}
	}

	public final EstadosExpContext estadosExp() throws RecognitionException {
		EstadosExpContext _localctx = new EstadosExpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estadosExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__3);
			setState(31);
			estados();
			setState(32);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadosContext extends ParserRuleContext {
		public TerminalNode ESTADOS() { return getToken(automatoParser.ESTADOS, 0); }
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public EstadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterEstados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitEstados(this);
		}
	}

	public final EstadosContext estados() throws RecognitionException {
		EstadosContext _localctx = new EstadosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estados);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(ESTADOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(ESTADOS);
				setState(36);
				match(T__1);
				setState(37);
				estados();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlfabetoExpContext extends ParserRuleContext {
		public AlfabetoContext alfabeto() {
			return getRuleContext(AlfabetoContext.class,0);
		}
		public AlfabetoExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfabetoExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterAlfabetoExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitAlfabetoExp(this);
		}
	}

	public final AlfabetoExpContext alfabetoExp() throws RecognitionException {
		AlfabetoExpContext _localctx = new AlfabetoExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alfabetoExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__3);
			setState(41);
			alfabeto();
			setState(42);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlfabetoContext extends ParserRuleContext {
		public TerminalNode ALFABETO() { return getToken(automatoParser.ALFABETO, 0); }
		public AlfabetoContext alfabeto() {
			return getRuleContext(AlfabetoContext.class,0);
		}
		public AlfabetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfabeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterAlfabeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitAlfabeto(this);
		}
	}

	public final AlfabetoContext alfabeto() throws RecognitionException {
		AlfabetoContext _localctx = new AlfabetoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alfabeto);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ALFABETO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(ALFABETO);
				setState(46);
				match(T__1);
				setState(47);
				alfabeto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransicaoExpContext extends ParserRuleContext {
		public TransicaoContext transicao() {
			return getRuleContext(TransicaoContext.class,0);
		}
		public TransicaoExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicaoExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterTransicaoExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitTransicaoExp(this);
		}
	}

	public final TransicaoExpContext transicaoExp() throws RecognitionException {
		TransicaoExpContext _localctx = new TransicaoExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transicaoExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			transicao();
			setState(52);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransicaoContext extends ParserRuleContext {
		public List<TerminalNode> ESTADOS() { return getTokens(automatoParser.ESTADOS); }
		public TerminalNode ESTADOS(int i) {
			return getToken(automatoParser.ESTADOS, i);
		}
		public TerminalNode ALFABETO() { return getToken(automatoParser.ALFABETO, 0); }
		public TransicaoContext transicao() {
			return getRuleContext(TransicaoContext.class,0);
		}
		public TransicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterTransicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitTransicao(this);
		}
	}

	public final TransicaoContext transicao() throws RecognitionException {
		TransicaoContext _localctx = new TransicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_transicao);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__5);
				setState(55);
				match(T__0);
				setState(56);
				match(ESTADOS);
				setState(57);
				match(T__1);
				setState(58);
				match(ALFABETO);
				setState(59);
				match(T__2);
				setState(60);
				match(T__6);
				setState(61);
				match(ESTADOS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__5);
				setState(63);
				match(T__0);
				setState(64);
				match(ESTADOS);
				setState(65);
				match(T__1);
				setState(66);
				match(ALFABETO);
				setState(67);
				match(T__2);
				setState(68);
				match(T__6);
				setState(69);
				match(ESTADOS);
				setState(70);
				match(T__1);
				setState(71);
				transicao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoInicialContext extends ParserRuleContext {
		public TerminalNode ESTADOS() { return getToken(automatoParser.ESTADOS, 0); }
		public EstadoInicialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estadoInicial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterEstadoInicial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitEstadoInicial(this);
		}
	}

	public final EstadoInicialContext estadoInicial() throws RecognitionException {
		EstadoInicialContext _localctx = new EstadoInicialContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_estadoInicial);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__3);
			setState(75);
			match(ESTADOS);
			setState(76);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstadoFinalContext extends ParserRuleContext {
		public EstadosContext estados() {
			return getRuleContext(EstadosContext.class,0);
		}
		public EstadoFinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estadoFinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).enterEstadoFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof automatoListener ) ((automatoListener)listener).exitEstadoFinal(this);
		}
	}

	public final EstadoFinalContext estadoFinal() throws RecognitionException {
		EstadoFinalContext _localctx = new EstadoFinalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_estadoFinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(79);
			estados();
			setState(80);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fU\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5"+
		"\4)\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bK\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22"+
		"\2\2\2N\2\24\3\2\2\2\4 \3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\62\3\2\2\2\f\64"+
		"\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22P\3\2\2\2\24\25\7\3\2\2\25\26\5\4\3"+
		"\2\26\27\7\4\2\2\27\30\5\b\5\2\30\31\7\4\2\2\31\32\5\f\7\2\32\33\7\4\2"+
		"\2\33\34\5\20\t\2\34\35\7\4\2\2\35\36\5\22\n\2\36\37\7\5\2\2\37\3\3\2"+
		"\2\2 !\7\6\2\2!\"\5\6\4\2\"#\7\7\2\2#\5\3\2\2\2$)\7\13\2\2%&\7\13\2\2"+
		"&\'\7\4\2\2\')\5\6\4\2($\3\2\2\2(%\3\2\2\2)\7\3\2\2\2*+\7\6\2\2+,\5\n"+
		"\6\2,-\7\7\2\2-\t\3\2\2\2.\63\7\n\2\2/\60\7\n\2\2\60\61\7\4\2\2\61\63"+
		"\5\n\6\2\62.\3\2\2\2\62/\3\2\2\2\63\13\3\2\2\2\64\65\7\6\2\2\65\66\5\16"+
		"\b\2\66\67\7\7\2\2\67\r\3\2\2\289\7\b\2\29:\7\3\2\2:;\7\13\2\2;<\7\4\2"+
		"\2<=\7\n\2\2=>\7\5\2\2>?\7\t\2\2?K\7\13\2\2@A\7\b\2\2AB\7\3\2\2BC\7\13"+
		"\2\2CD\7\4\2\2DE\7\n\2\2EF\7\5\2\2FG\7\t\2\2GH\7\13\2\2HI\7\4\2\2IK\5"+
		"\16\b\2J8\3\2\2\2J@\3\2\2\2K\17\3\2\2\2LM\7\6\2\2MN\7\13\2\2NO\7\7\2\2"+
		"O\21\3\2\2\2PQ\7\6\2\2QR\5\6\4\2RS\7\7\2\2S\23\3\2\2\2\5(\62J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}