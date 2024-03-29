// Generated from Traductor.g4 by ANTLR 4.7.2
package com.ide.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraductorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, VOID=3, MAIN=4, PRINT=5, TRUE=6, FALSE=7, IF=8, ELSE=9, 
		WHILE=10, OR=11, AND=12, IG=13, NIG=14, GT=15, LT=16, GTEQ=17, LTEQ=18, 
		NOT=19, IGUAL=20, SUM=21, RES=22, MUL=23, DIV=24, PA=25, PC=26, LA=27, 
		LC=28, COMENTARIO=29, COMENTARIO_LINEA=30, ID=31, NUMERO=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "INT", "VOID", "MAIN", "PRINT", "TRUE", "FALSE", "IF", "ELSE", 
			"WHILE", "OR", "AND", "IG", "NIG", "GT", "LT", "GTEQ", "LTEQ", "NOT", 
			"IGUAL", "SUM", "RES", "MUL", "DIV", "PA", "PC", "LA", "LC", "COMENTARIO", 
			"COMENTARIO_LINEA", "ID", "NUMERO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'int'", "'void'", "'main'", "'printf'", "'true'", "'false'", 
			"'if'", "'else'", "'while'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", 
			"'>='", "'<='", "'!'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "INT", "VOID", "MAIN", "PRINT", "TRUE", "FALSE", "IF", "ELSE", 
			"WHILE", "OR", "AND", "IG", "NIG", "GT", "LT", "GTEQ", "LTEQ", "NOT", 
			"IGUAL", "SUM", "RES", "MUL", "DIV", "PA", "PC", "LA", "LC", "COMENTARIO", 
			"COMENTARIO_LINEA", "ID", "NUMERO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public TraductorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Traductor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00cb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\7\36\u00a4\n\36\f\36\16\36\u00a7\13\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00b2\n\37\f\37\16\37\u00b5\13\37"+
		"\3\37\3\37\3 \3 \7 \u00bb\n \f \16 \u00be\13 \3!\6!\u00c1\n!\r!\16!\u00c2"+
		"\3\"\6\"\u00c6\n\"\r\"\16\"\u00c7\3\"\3\"\3\u00a5\2#\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\4\2"+
		"\f\f\17\17\4\2C\\c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00cf\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2"+
		"\7K\3\2\2\2\tP\3\2\2\2\13U\3\2\2\2\r\\\3\2\2\2\17a\3\2\2\2\21g\3\2\2\2"+
		"\23j\3\2\2\2\25o\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2\2"+
		"\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61"+
		"\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009d"+
		"\3\2\2\2;\u009f\3\2\2\2=\u00ad\3\2\2\2?\u00b8\3\2\2\2A\u00c0\3\2\2\2C"+
		"\u00c5\3\2\2\2EF\7=\2\2F\4\3\2\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\6\3\2\2"+
		"\2KL\7x\2\2LM\7q\2\2MN\7k\2\2NO\7f\2\2O\b\3\2\2\2PQ\7o\2\2QR\7c\2\2RS"+
		"\7k\2\2ST\7p\2\2T\n\3\2\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2"+
		"\2Z[\7h\2\2[\f\3\2\2\2\\]\7v\2\2]^\7t\2\2^_\7w\2\2_`\7g\2\2`\16\3\2\2"+
		"\2ab\7h\2\2bc\7c\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f\20\3\2\2\2gh\7k\2\2h"+
		"i\7h\2\2i\22\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\24\3\2\2\2o"+
		"p\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\26\3\2\2\2uv\7~\2\2vw\7"+
		"~\2\2w\30\3\2\2\2xy\7(\2\2yz\7(\2\2z\32\3\2\2\2{|\7?\2\2|}\7?\2\2}\34"+
		"\3\2\2\2~\177\7#\2\2\177\u0080\7?\2\2\u0080\36\3\2\2\2\u0081\u0082\7@"+
		"\2\2\u0082 \3\2\2\2\u0083\u0084\7>\2\2\u0084\"\3\2\2\2\u0085\u0086\7@"+
		"\2\2\u0086\u0087\7?\2\2\u0087$\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a"+
		"\7?\2\2\u008a&\3\2\2\2\u008b\u008c\7#\2\2\u008c(\3\2\2\2\u008d\u008e\7"+
		"?\2\2\u008e*\3\2\2\2\u008f\u0090\7-\2\2\u0090,\3\2\2\2\u0091\u0092\7/"+
		"\2\2\u0092.\3\2\2\2\u0093\u0094\7,\2\2\u0094\60\3\2\2\2\u0095\u0096\7"+
		"\61\2\2\u0096\62\3\2\2\2\u0097\u0098\7*\2\2\u0098\64\3\2\2\2\u0099\u009a"+
		"\7+\2\2\u009a\66\3\2\2\2\u009b\u009c\7}\2\2\u009c8\3\2\2\2\u009d\u009e"+
		"\7\177\2\2\u009e:\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7,\2\2\u00a1"+
		"\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\b\36\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af"+
		"\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\2\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\37\2\2\u00b7>\3\2\2\2\u00b8"+
		"\u00bc\t\3\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd@\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3B\3\2\2\2\u00c4\u00c6\t\6\2\2"+
		"\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\"\2\2\u00caD\3\2\2\2\b\2\u00a5"+
		"\u00b3\u00bc\u00c2\u00c7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}