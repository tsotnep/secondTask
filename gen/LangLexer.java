// Generated from /home/tsotne/git/iag0450-antlr-1/secondTask/src/Lang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ENDLN=3, EXIT=4, CREATE=5, WITH=6, EQ=7, VARNAME=8, VALUE=9, 
		ADD=10, COMMENT=11, MULTILINECOMMENT=12, EOL=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ENDLN", "EXIT", "CREATE", "WITH", "EQ", "VARNAME", "VALUE", 
		"ADD", "COMMENT", "MULTILINECOMMENT", "EOL"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\6\t>\n\t\r\t\16\t?\3\n\6\nC\n\n\r\n\16\nD\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\fM\n\f\f\f\16\fP\13\f\3\f\5\fS\n\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\4N\\\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\3\2\6\4\2C\\c|\3\2\62;\3\3\f\f\5\2\13\f\17\17\"\"k\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13.\3\2"+
		"\2\2\r\65\3\2\2\2\17:\3\2\2\2\21=\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27H"+
		"\3\2\2\2\31V\3\2\2\2\33d\3\2\2\2\35\36\7]\2\2\36\4\3\2\2\2\37 \7_\2\2"+
		" \6\3\2\2\2!\"\7=\2\2\"\b\3\2\2\2#$\7G\2\2$%\7Z\2\2%&\7K\2\2&\'\7V\2\2"+
		"\'(\7R\2\2()\7N\2\2)*\7G\2\2*+\7C\2\2+,\7U\2\2,-\7G\2\2-\n\3\2\2\2./\7"+
		"e\2\2/\60\7t\2\2\60\61\7g\2\2\61\62\7c\2\2\62\63\7v\2\2\63\64\7g\2\2\64"+
		"\f\3\2\2\2\65\66\7y\2\2\66\67\7k\2\2\678\7v\2\289\7j\2\29\16\3\2\2\2:"+
		";\7?\2\2;\20\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\22\3\2\2\2AC\t\3\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\24\3\2"+
		"\2\2FG\7-\2\2G\26\3\2\2\2HI\7\61\2\2IJ\7\61\2\2JN\3\2\2\2KM\13\2\2\2L"+
		"K\3\2\2\2MP\3\2\2\2NO\3\2\2\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\t\4\2\2"+
		"RQ\3\2\2\2ST\3\2\2\2TU\b\f\2\2U\30\3\2\2\2VW\7\61\2\2WX\7,\2\2X\\\3\2"+
		"\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2^\\"+
		"\3\2\2\2_`\7,\2\2`a\7\61\2\2ab\3\2\2\2bc\b\r\2\2c\32\3\2\2\2de\t\5\2\2"+
		"ef\3\2\2\2fg\b\16\2\2g\34\3\2\2\2\b\2?DNR\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}