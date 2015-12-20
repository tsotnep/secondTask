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
		ENDLN=1, EXIT=2, CREATE=3, WITH=4, EQ=5, VARNAME=6, VALUE=7, ADD=8, COMMENT=9, 
		MULTILINECOMMENT=10, EOL=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ENDLN", "EXIT", "CREATE", "WITH", "EQ", "VARNAME", "VALUE", "ADD", "COMMENT", 
		"MULTILINECOMMENT", "EOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'EXITPLEASE'", "'create'", "'with'", "'='", null, null, 
		"'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ENDLN", "EXIT", "CREATE", "WITH", "EQ", "VARNAME", "VALUE", "ADD", 
		"COMMENT", "MULTILINECOMMENT", "EOL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\6\7\66\n\7\r\7"+
		"\16\7\67\3\b\6\b;\n\b\r\b\16\b<\3\t\3\t\3\n\3\n\3\n\3\n\7\nE\n\n\f\n\16"+
		"\nH\13\n\3\n\5\nK\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13S\n\13\f\13\16\13"+
		"V\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\4FT\2\r\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\6\4\2C\\c|\3\2\62;\3\3\f\f\5"+
		"\2\13\f\17\17\"\"c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7&\3\2\2\2\t-\3\2\2\2\13\62"+
		"\3\2\2\2\r\65\3\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23@\3\2\2\2\25N\3\2\2\2"+
		"\27\\\3\2\2\2\31\32\7=\2\2\32\4\3\2\2\2\33\34\7G\2\2\34\35\7Z\2\2\35\36"+
		"\7K\2\2\36\37\7V\2\2\37 \7R\2\2 !\7N\2\2!\"\7G\2\2\"#\7C\2\2#$\7U\2\2"+
		"$%\7G\2\2%\6\3\2\2\2&\'\7e\2\2\'(\7t\2\2()\7g\2\2)*\7c\2\2*+\7v\2\2+,"+
		"\7g\2\2,\b\3\2\2\2-.\7y\2\2./\7k\2\2/\60\7v\2\2\60\61\7j\2\2\61\n\3\2"+
		"\2\2\62\63\7?\2\2\63\f\3\2\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2"+
		"\2\67\65\3\2\2\2\678\3\2\2\28\16\3\2\2\29;\t\3\2\2:9\3\2\2\2;<\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=\20\3\2\2\2>?\7-\2\2?\22\3\2\2\2@A\7\61\2\2AB\7\61"+
		"\2\2BF\3\2\2\2CE\13\2\2\2DC\3\2\2\2EH\3\2\2\2FG\3\2\2\2FD\3\2\2\2GJ\3"+
		"\2\2\2HF\3\2\2\2IK\t\4\2\2JI\3\2\2\2KL\3\2\2\2LM\b\n\2\2M\24\3\2\2\2N"+
		"O\7\61\2\2OP\7,\2\2PT\3\2\2\2QS\13\2\2\2RQ\3\2\2\2SV\3\2\2\2TU\3\2\2\2"+
		"TR\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7,\2\2XY\7\61\2\2YZ\3\2\2\2Z[\b\13\2"+
		"\2[\26\3\2\2\2\\]\t\5\2\2]^\3\2\2\2^_\b\f\2\2_\30\3\2\2\2\b\2\67<FJT\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}