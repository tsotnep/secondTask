// Generated from E:/Workspace/iag0450-antlr/secondTask/src\language.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PLUS=2, MINUS=3, SEMICOLON=4, ASSIGN=5, EXIT=6, ID=7, COMMENT=8, 
		MULTILINECOMMENT=9, EOL=10;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_stmt = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"prog", "line", "stmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'", "'-'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "PLUS", "MINUS", "SEMICOLON", "ASSIGN", "EXIT", "ID", "COMMENT", 
		"MULTILINECOMMENT", "EOL"
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

	public languageParser(TokenStream input) {
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
			if ( listener instanceof languageListener ) ((languageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitProg(this);
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
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				line();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EXIT || _la==ID );
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
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			stmt();
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
	public static class AssignContext extends StmtContext {
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(languageParser.SEMICOLON, 0); }
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExitStmtContext extends StmtContext {
		public TerminalNode EXIT() { return getToken(languageParser.EXIT, 0); }
		public ExitStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(21);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(ID);
				setState(16);
				match(ASSIGN);
				setState(17);
				expr(0);
				setState(18);
				match(SEMICOLON);
				}
				break;
			case EXIT:
				_localctx = new ExitStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(EXIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(languageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(languageParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(languageParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(languageParser.MINUS, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof languageListener ) ((languageListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof languageVisitor ) return ((languageVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(24);
					match(MINUS);
					}
				}

				setState(27);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(28);
					match(MINUS);
					}
				}

				setState(31);
				match(INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(34);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(35);
					((AddSubContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(36);
					expr(4);
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\30\n\4\3\5\3\5\5\5\34\n\5\3\5\3\5\5\5 \n\5\3\5\5\5#\n\5\3\5"+
		"\3\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\2\3\b\6\2\4\6\b\2\3\3\2\4\5.\2\13"+
		"\3\2\2\2\4\17\3\2\2\2\6\27\3\2\2\2\b\"\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2"+
		"\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\20\5\6\4\2\20"+
		"\5\3\2\2\2\21\22\7\t\2\2\22\23\7\7\2\2\23\24\5\b\5\2\24\25\7\6\2\2\25"+
		"\30\3\2\2\2\26\30\7\b\2\2\27\21\3\2\2\2\27\26\3\2\2\2\30\7\3\2\2\2\31"+
		"\33\b\5\1\2\32\34\7\5\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35"+
		"#\7\t\2\2\36 \7\5\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\7\3\2\2\""+
		"\31\3\2\2\2\"\37\3\2\2\2#)\3\2\2\2$%\f\5\2\2%&\t\2\2\2&(\5\b\5\6\'$\3"+
		"\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\t\3\2\2\2+)\3\2\2\2\b\r\27\33\37"+
		"\")";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}