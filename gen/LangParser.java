// Generated from /home/tsotne/git/iag0450-antlr-1/secondTask/src/Lang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ENDLN=3, EXIT=4, CREATE=5, WITH=6, EQ=7, VARNAME=8, VALUE=9, 
		ADD=10, COMMENT=11, MULTILINECOMMENT=12, EOL=13;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_stmt = 2;
	public static final String[] ruleNames = {
		"prog", "line", "stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "';'", "'EXITPLEASE'", "'create'", "'with'", "'='", 
		null, null, "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ENDLN", "EXIT", "CREATE", "WITH", "EQ", "VARNAME", 
		"VALUE", "ADD", "COMMENT", "MULTILINECOMMENT", "EOL"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				line();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXIT) | (1L << CREATE) | (1L << VARNAME))) != 0) );
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

	public static class LineContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode ENDLN() { return getToken(LangParser.ENDLN, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			stmt();
			setState(12);
			match(ENDLN);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateArrayContext extends StmtContext {
		public TerminalNode CREATE() { return getToken(LangParser.CREATE, 0); }
		public TerminalNode VARNAME() { return getToken(LangParser.VARNAME, 0); }
		public TerminalNode WITH() { return getToken(LangParser.WITH, 0); }
		public List<TerminalNode> VALUE() { return getTokens(LangParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LangParser.VALUE, i);
		}
		public CreateArrayContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCreateArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCreateArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCreateArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddToVarTheArrayContext extends StmtContext {
		public List<TerminalNode> VARNAME() { return getTokens(LangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(LangParser.VARNAME, i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode VALUE() { return getToken(LangParser.VALUE, 0); }
		public AddToVarTheArrayContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAddToVarTheArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAddToVarTheArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAddToVarTheArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateWithValueContext extends StmtContext {
		public TerminalNode CREATE() { return getToken(LangParser.CREATE, 0); }
		public TerminalNode VARNAME() { return getToken(LangParser.VARNAME, 0); }
		public TerminalNode WITH() { return getToken(LangParser.WITH, 0); }
		public TerminalNode VALUE() { return getToken(LangParser.VALUE, 0); }
		public CreateWithValueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCreateWithValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCreateWithValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCreateWithValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssVarValContext extends StmtContext {
		public List<TerminalNode> VARNAME() { return getTokens(LangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(LangParser.VARNAME, i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode ADD() { return getToken(LangParser.ADD, 0); }
		public TerminalNode VALUE() { return getToken(LangParser.VALUE, 0); }
		public AssVarValContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssVarVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssVarVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssVarVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssValValContext extends StmtContext {
		public TerminalNode VARNAME() { return getToken(LangParser.VARNAME, 0); }
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public List<TerminalNode> VALUE() { return getTokens(LangParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LangParser.VALUE, i);
		}
		public TerminalNode ADD() { return getToken(LangParser.ADD, 0); }
		public AssValValContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssValVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssValVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssValVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddToArrayElementContext extends StmtContext {
		public TerminalNode VARNAME() { return getToken(LangParser.VARNAME, 0); }
		public List<TerminalNode> VALUE() { return getTokens(LangParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(LangParser.VALUE, i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public AddToArrayElementContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAddToArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAddToArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAddToArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExitStmtContext extends StmtContext {
		public TerminalNode EXIT() { return getToken(LangParser.EXIT, 0); }
		public ExitStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssVarVarContext extends StmtContext {
		public List<TerminalNode> VARNAME() { return getTokens(LangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(LangParser.VARNAME, i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode ADD() { return getToken(LangParser.ADD, 0); }
		public AssVarVarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssVarVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssVarVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssVarVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExitStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(EXIT);
				}
				break;
			case 2:
				_localctx = new CreateWithValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(CREATE);
				setState(16);
				match(VARNAME);
				setState(17);
				match(WITH);
				setState(18);
				match(VALUE);
				}
				break;
			case 3:
				_localctx = new CreateArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19);
				match(CREATE);
				setState(20);
				match(VARNAME);
				setState(21);
				match(WITH);
				setState(22);
				match(T__0);
				setState(23);
				match(VALUE);
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					match(VALUE);
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VALUE );
				setState(29);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new AssVarValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				match(VARNAME);
				setState(31);
				match(EQ);
				setState(38);
				switch (_input.LA(1)) {
				case VARNAME:
					{
					{
					setState(32);
					match(VARNAME);
					setState(33);
					match(ADD);
					setState(34);
					match(VALUE);
					}
					}
					break;
				case VALUE:
					{
					{
					setState(35);
					match(VALUE);
					setState(36);
					match(ADD);
					setState(37);
					match(VARNAME);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				_localctx = new AssVarVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(VARNAME);
				setState(41);
				match(EQ);
				setState(42);
				match(VARNAME);
				setState(43);
				match(ADD);
				setState(44);
				match(VARNAME);
				}
				break;
			case 6:
				_localctx = new AssValValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
				match(VARNAME);
				setState(46);
				match(EQ);
				setState(47);
				match(VALUE);
				setState(48);
				match(ADD);
				setState(49);
				match(VALUE);
				}
				break;
			case 7:
				_localctx = new AddToArrayElementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				match(VARNAME);
				setState(51);
				match(VALUE);
				setState(52);
				match(EQ);
				setState(53);
				match(VALUE);
				}
				break;
			case 8:
				_localctx = new AddToVarTheArrayContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(54);
				match(VARNAME);
				setState(55);
				match(EQ);
				setState(56);
				match(VARNAME);
				setState(57);
				match(VALUE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4)\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\2\2\5\2\4\6\2\2E\2\t\3\2\2\2\4\r"+
		"\3\2\2\2\6<\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2"+
		"\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2\16\17\7\5\2\2\17\5\3\2\2\2\20="+
		"\7\6\2\2\21\22\7\7\2\2\22\23\7\n\2\2\23\24\7\b\2\2\24=\7\13\2\2\25\26"+
		"\7\7\2\2\26\27\7\n\2\2\27\30\7\b\2\2\30\31\7\3\2\2\31\33\7\13\2\2\32\34"+
		"\7\13\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\3\2\2\2\37=\7\4\2\2 !\7\n\2\2!(\7\t\2\2\"#\7\n\2\2#$\7\f\2\2$)\7\13\2"+
		"\2%&\7\13\2\2&\'\7\f\2\2\')\7\n\2\2(\"\3\2\2\2(%\3\2\2\2)=\3\2\2\2*+\7"+
		"\n\2\2+,\7\t\2\2,-\7\n\2\2-.\7\f\2\2.=\7\n\2\2/\60\7\n\2\2\60\61\7\t\2"+
		"\2\61\62\7\13\2\2\62\63\7\f\2\2\63=\7\13\2\2\64\65\7\n\2\2\65\66\7\13"+
		"\2\2\66\67\7\t\2\2\67=\7\13\2\289\7\n\2\29:\7\t\2\2:;\7\n\2\2;=\7\13\2"+
		"\2<\20\3\2\2\2<\21\3\2\2\2<\25\3\2\2\2< \3\2\2\2<*\3\2\2\2</\3\2\2\2<"+
		"\64\3\2\2\2<8\3\2\2\2=\7\3\2\2\2\6\13\35(<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}