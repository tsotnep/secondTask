// Generated from E:/Workspace/iag0450-antlr/secondTask/src\language.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class languageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, PLUS=2, MINUS=3, SEMICOLON=4, ASSIGN=5, EXIT=6, ID=7, COMMENT=8, 
		MULTILINECOMMENT=9, EOL=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "PLUS", "MINUS", "SEMICOLON", "ASSIGN", "EXIT", "ID", "COMMENT", 
		"MULTILINECOMMENT", "EOL"
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


	public languageLexer(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fU\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\6\2\31\n\2\r\2\16\2\32\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7-\n\7\3\b\3\b\7\b\61\n\b\f\b\16\b\64\13\b"+
		"\3\t\3\t\3\t\3\t\7\t:\n\t\f\t\16\t=\13\t\3\t\5\t@\n\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\7\nH\n\n\f\n\16\nK\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\4;I\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\7\3\2\62"+
		";\5\2C\\aac|\6\2\62;C\\aac|\3\3\f\f\5\2\13\f\17\17\"\"Y\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\30\3\2\2\2\5\34\3\2\2\2\7"+
		"\36\3\2\2\2\t \3\2\2\2\13\"\3\2\2\2\r,\3\2\2\2\17.\3\2\2\2\21\65\3\2\2"+
		"\2\23C\3\2\2\2\25Q\3\2\2\2\27\31\t\2\2\2\30\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\30\3\2\2\2\32\33\3\2\2\2\33\4\3\2\2\2\34\35\7-\2\2\35\6\3\2\2\2\36\37"+
		"\7/\2\2\37\b\3\2\2\2 !\7=\2\2!\n\3\2\2\2\"#\7?\2\2#\f\3\2\2\2$%\7g\2\2"+
		"%&\7z\2\2&\'\7k\2\2\'-\7v\2\2()\7G\2\2)*\7Z\2\2*+\7K\2\2+-\7V\2\2,$\3"+
		"\2\2\2,(\3\2\2\2-\16\3\2\2\2.\62\t\3\2\2/\61\t\4\2\2\60/\3\2\2\2\61\64"+
		"\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\20\3\2\2\2\64\62\3\2\2\2\65\66"+
		"\7\61\2\2\66\67\7\61\2\2\67;\3\2\2\28:\13\2\2\298\3\2\2\2:=\3\2\2\2;<"+
		"\3\2\2\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2>@\t\5\2\2?>\3\2\2\2@A\3\2\2\2A"+
		"B\b\t\2\2B\22\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2\2"+
		"\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MN\7\61\2"+
		"\2NO\3\2\2\2OP\b\n\2\2P\24\3\2\2\2QR\t\6\2\2RS\3\2\2\2ST\b\13\2\2T\26"+
		"\3\2\2\2\t\2\32,\62;?I\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}