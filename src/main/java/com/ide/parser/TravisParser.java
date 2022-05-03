// Generated from Travis.g4 by ANTLR 4.7.2
package com.ide.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TravisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT=2, VOID=3, MAIN=4, PRINT=5, TRUE=6, FALSE=7, IF=8, ELSE=9, 
		WHILE=10, OR=11, AND=12, IG=13, NIG=14, GT=15, LT=16, GTEQ=17, LTEQ=18, 
		NOT=19, IGUAL=20, SUM=21, RES=22, MUL=23, DIV=24, PA=25, PC=26, LA=27, 
		LC=28, COMENTARIO=29, COMENTARIO_LINEA=30, ID=31, NUMERO=32, WS=33;
	public static final int
		RULE_programa = 0, RULE_encabezado = 1, RULE_cuerpo = 2, RULE_declaraciones = 3, 
		RULE_if_state = 4, RULE_else_state = 5, RULE_elseIf_state = 6, RULE_while_state = 7, 
		RULE_declarasignar = 8, RULE_declaracion = 9, RULE_impresion = 10, RULE_asignacion = 11, 
		RULE_condicion = 12, RULE_expr = 13, RULE_tipo_dato = 14, RULE_declaracionesElse = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "encabezado", "cuerpo", "declaraciones", "if_state", "else_state", 
			"elseIf_state", "while_state", "declarasignar", "declaracion", "impresion", 
			"asignacion", "condicion", "expr", "tipo_dato", "declaracionesElse"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'lit'", "'astro'", "'world'", "'outwest'", "'true'", "'false'", 
			"'dis'", "'antidote'", "'rodeo'", "'||'", "'&&'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'!'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", 
			"')'", "'{'", "'}'"
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

	@Override
	public String getGrammarFileName() { return "Travis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TravisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public EncabezadoContext encabezado() {
			return getRuleContext(EncabezadoContext.class,0);
		}
		public TerminalNode LA() { return getToken(TravisParser.LA, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode LC() { return getToken(TravisParser.LC, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			encabezado();
			setState(33);
			match(LA);
			setState(34);
			cuerpo();
			setState(35);
			match(LC);
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

	public static class EncabezadoContext extends ParserRuleContext {
		public EncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encabezado; }
	 
		public EncabezadoContext() { }
		public void copyFrom(EncabezadoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InicioContext extends EncabezadoContext {
		public TerminalNode VOID() { return getToken(TravisParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(TravisParser.MAIN, 0); }
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public InicioContext(EncabezadoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EncabezadoContext encabezado() throws RecognitionException {
		EncabezadoContext _localctx = new EncabezadoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_encabezado);
		try {
			_localctx = new InicioContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(VOID);
			setState(38);
			match(MAIN);
			setState(39);
			match(PA);
			setState(40);
			match(PC);
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

	public static class CuerpoContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cuerpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			declaraciones();
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public List<While_stateContext> while_state() {
			return getRuleContexts(While_stateContext.class);
		}
		public While_stateContext while_state(int i) {
			return getRuleContext(While_stateContext.class,i);
		}
		public List<If_stateContext> if_state() {
			return getRuleContexts(If_stateContext.class);
		}
		public If_stateContext if_state(int i) {
			return getRuleContext(If_stateContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<ImpresionContext> impresion() {
			return getRuleContexts(ImpresionContext.class);
		}
		public ImpresionContext impresion(int i) {
			return getRuleContext(ImpresionContext.class,i);
		}
		public List<DeclarasignarContext> declarasignar() {
			return getRuleContexts(DeclarasignarContext.class);
		}
		public DeclarasignarContext declarasignar(int i) {
			return getRuleContext(DeclarasignarContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PRINT) | (1L << IF) | (1L << WHILE) | (1L << ID))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(44);
					while_state();
					}
					break;
				case 2:
					{
					setState(45);
					if_state();
					}
					break;
				case 3:
					{
					setState(46);
					asignacion();
					}
					break;
				case 4:
					{
					setState(47);
					declaracion();
					}
					break;
				case 5:
					{
					setState(48);
					impresion();
					}
					break;
				case 6:
					{
					setState(49);
					declarasignar();
					}
					break;
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class If_stateContext extends ParserRuleContext {
		public If_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_state; }
	 
		public If_stateContext() { }
		public void copyFrom(If_stateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfGodContext extends If_stateContext {
		public TerminalNode IF() { return getToken(TravisParser.IF, 0); }
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public TerminalNode LA() { return getToken(TravisParser.LA, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(TravisParser.LC, 0); }
		public List<ElseIf_stateContext> elseIf_state() {
			return getRuleContexts(ElseIf_stateContext.class);
		}
		public ElseIf_stateContext elseIf_state(int i) {
			return getRuleContext(ElseIf_stateContext.class,i);
		}
		public Else_stateContext else_state() {
			return getRuleContext(Else_stateContext.class,0);
		}
		public IfGodContext(If_stateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitIfGod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stateContext if_state() throws RecognitionException {
		If_stateContext _localctx = new If_stateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_state);
		int _la;
		try {
			int _alt;
			_localctx = new IfGodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(IF);
			setState(56);
			match(PA);
			setState(57);
			condicion(0);
			setState(58);
			match(PC);
			setState(59);
			match(LA);
			setState(60);
			declaraciones();
			setState(61);
			match(LC);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					elseIf_state();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(68);
				else_state();
				}
			}

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

	public static class Else_stateContext extends ParserRuleContext {
		public Else_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_state; }
	 
		public Else_stateContext() { }
		public void copyFrom(Else_stateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseGodContext extends Else_stateContext {
		public TerminalNode ELSE() { return getToken(TravisParser.ELSE, 0); }
		public TerminalNode LA() { return getToken(TravisParser.LA, 0); }
		public DeclaracionesElseContext declaracionesElse() {
			return getRuleContext(DeclaracionesElseContext.class,0);
		}
		public TerminalNode LC() { return getToken(TravisParser.LC, 0); }
		public ElseGodContext(Else_stateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitElseGod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stateContext else_state() throws RecognitionException {
		Else_stateContext _localctx = new Else_stateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_state);
		try {
			_localctx = new ElseGodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ELSE);
			setState(72);
			match(LA);
			setState(73);
			declaracionesElse();
			setState(74);
			match(LC);
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

	public static class ElseIf_stateContext extends ParserRuleContext {
		public ElseIf_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf_state; }
	 
		public ElseIf_stateContext() { }
		public void copyFrom(ElseIf_stateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseifgodContext extends ElseIf_stateContext {
		public TerminalNode ELSE() { return getToken(TravisParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(TravisParser.IF, 0); }
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public TerminalNode LA() { return getToken(TravisParser.LA, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(TravisParser.LC, 0); }
		public ElseifgodContext(ElseIf_stateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitElseifgod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIf_stateContext elseIf_state() throws RecognitionException {
		ElseIf_stateContext _localctx = new ElseIf_stateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elseIf_state);
		try {
			_localctx = new ElseifgodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ELSE);
			setState(77);
			match(IF);
			setState(78);
			match(PA);
			setState(79);
			condicion(0);
			setState(80);
			match(PC);
			setState(81);
			match(LA);
			setState(82);
			declaraciones();
			setState(83);
			match(LC);
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

	public static class While_stateContext extends ParserRuleContext {
		public While_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_state; }
	 
		public While_stateContext() { }
		public void copyFrom(While_stateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileGodContext extends While_stateContext {
		public TerminalNode WHILE() { return getToken(TravisParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public TerminalNode LA() { return getToken(TravisParser.LA, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(TravisParser.LC, 0); }
		public WhileGodContext(While_stateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitWhileGod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stateContext while_state() throws RecognitionException {
		While_stateContext _localctx = new While_stateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_state);
		try {
			_localctx = new WhileGodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(WHILE);
			setState(86);
			match(PA);
			setState(87);
			condicion(0);
			setState(88);
			match(PC);
			setState(89);
			match(LA);
			setState(90);
			declaraciones();
			setState(91);
			match(LC);
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

	public static class DeclarasignarContext extends ParserRuleContext {
		public DeclarasignarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarasignar; }
	 
		public DeclarasignarContext() { }
		public void copyFrom(DeclarasignarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarasigodContext extends DeclarasignarContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ID() { return getToken(TravisParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(TravisParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarasigodContext(DeclarasignarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitDeclarasigod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarasignarContext declarasignar() throws RecognitionException {
		DeclarasignarContext _localctx = new DeclarasignarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declarasignar);
		try {
			_localctx = new DeclarasigodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			tipo_dato();
			setState(94);
			match(ID);
			setState(95);
			match(IGUAL);
			setState(96);
			expr(0);
			setState(97);
			match(T__0);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaragodContext extends DeclaracionContext {
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public TerminalNode ID() { return getToken(TravisParser.ID, 0); }
		public DeclaragodContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitDeclaragod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion);
		try {
			_localctx = new DeclaragodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			tipo_dato();
			setState(100);
			match(ID);
			setState(101);
			match(T__0);
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

	public static class ImpresionContext extends ParserRuleContext {
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
	 
		public ImpresionContext() { }
		public void copyFrom(ImpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImpregodContext extends ImpresionContext {
		public TerminalNode PRINT() { return getToken(TravisParser.PRINT, 0); }
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public ImpregodContext(ImpresionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitImpregod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresion);
		try {
			_localctx = new ImpregodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(PRINT);
			setState(104);
			match(PA);
			setState(105);
			expr(0);
			setState(106);
			match(PC);
			setState(107);
			match(T__0);
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

	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignagodContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(TravisParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(TravisParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignagodContext(AsignacionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitAsignagod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			_localctx = new AsignagodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ID);
			setState(110);
			match(IGUAL);
			setState(111);
			expr(0);
			setState(112);
			match(T__0);
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

	public static class CondicionContext extends ParserRuleContext {
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	 
		public CondicionContext() { }
		public void copyFrom(CondicionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelacionalContext extends CondicionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(TravisParser.GT, 0); }
		public TerminalNode LT() { return getToken(TravisParser.LT, 0); }
		public TerminalNode GTEQ() { return getToken(TravisParser.GTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(TravisParser.LTEQ, 0); }
		public RelacionalContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionParentesisContext extends CondicionContext {
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public CondicionParentesisContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitCondicionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueGodContext extends CondicionContext {
		public TerminalNode TRUE() { return getToken(TravisParser.TRUE, 0); }
		public TrueGodContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitTrueGod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionNContext extends CondicionContext {
		public TerminalNode NUMERO() { return getToken(TravisParser.NUMERO, 0); }
		public CondicionNContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitCondicionN(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualdadContext extends CondicionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IG() { return getToken(TravisParser.IG, 0); }
		public TerminalNode NIG() { return getToken(TravisParser.NIG, 0); }
		public IgualdadContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode OR() { return getToken(TravisParser.OR, 0); }
		public OrExprContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseGodContext extends CondicionContext {
		public TerminalNode FALSE() { return getToken(TravisParser.FALSE, 0); }
		public FalseGodContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitFalseGod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends CondicionContext {
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode AND() { return getToken(TravisParser.AND, 0); }
		public AndExprContext(CondicionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new IgualdadContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				expr(0);
				setState(116);
				((IgualdadContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IG || _la==NIG) ) {
					((IgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				expr(0);
				}
				break;
			case 2:
				{
				_localctx = new RelacionalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				expr(0);
				setState(120);
				((RelacionalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
					((RelacionalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new TrueGodContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseGodContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(FALSE);
				}
				break;
			case 5:
				{
				_localctx = new CondicionNContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(NUMERO);
				}
				break;
			case 6:
				{
				_localctx = new CondicionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(PA);
				setState(127);
				condicion(0);
				setState(128);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(132);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(133);
						match(AND);
						setState(134);
						condicion(9);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new CondicionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condicion);
						setState(135);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(136);
						match(OR);
						setState(137);
						condicion(8);
						}
						break;
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class IntnegContext extends ExprContext {
		public TerminalNode RES() { return getToken(TravisParser.RES, 0); }
		public TerminalNode NUMERO() { return getToken(TravisParser.NUMERO, 0); }
		public IntnegContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitIntneg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PA() { return getToken(TravisParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(TravisParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(TravisParser.SUM, 0); }
		public TerminalNode RES() { return getToken(TravisParser.RES, 0); }
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitSumRes(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(TravisParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode NUMERO() { return getToken(TravisParser.NUMERO, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TravisParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TravisParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitMulDiv(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(144);
				match(NUMERO);
				}
				break;
			case RES:
				{
				_localctx = new IntnegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(RES);
				setState(146);
				match(NUMERO);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ID);
				}
				break;
			case PA:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(PA);
				setState(149);
				expr(0);
				setState(150);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(160);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(156);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(159);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TravisParser.INT, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_dato);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(INT);
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

	public static class DeclaracionesElseContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionesElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionesElse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TravisVisitor ) return ((TravisVisitor<? extends T>)visitor).visitDeclaracionesElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesElseContext declaracionesElse() throws RecognitionException {
		DeclaracionesElseContext _localctx = new DeclaracionesElseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaracionesElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			declaraciones();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6B\n\6\f\6\16\6"+
		"E\13\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16\16\16"+
		"\u0090\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009b\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6\13"+
		"\17\3\20\3\20\3\21\3\21\3\21\2\4\32\34\22\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \2\6\3\2\17\20\3\2\21\24\3\2\31\32\3\2\27\30\2\u00af\2\"\3\2"+
		"\2\2\4\'\3\2\2\2\6,\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\fI\3\2\2\2\16N\3\2"+
		"\2\2\20W\3\2\2\2\22_\3\2\2\2\24e\3\2\2\2\26i\3\2\2\2\30o\3\2\2\2\32\u0084"+
		"\3\2\2\2\34\u009a\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\"#\5\4\3\2#"+
		"$\7\35\2\2$%\5\6\4\2%&\7\36\2\2&\3\3\2\2\2\'(\7\5\2\2()\7\6\2\2)*\7\33"+
		"\2\2*+\7\34\2\2+\5\3\2\2\2,-\5\b\5\2-\7\3\2\2\2.\65\5\20\t\2/\65\5\n\6"+
		"\2\60\65\5\30\r\2\61\65\5\24\13\2\62\65\5\26\f\2\63\65\5\22\n\2\64.\3"+
		"\2\2\2\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2"+
		"\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28\66\3\2\2\2"+
		"9:\7\n\2\2:;\7\33\2\2;<\5\32\16\2<=\7\34\2\2=>\7\35\2\2>?\5\b\5\2?C\7"+
		"\36\2\2@B\5\16\b\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2E"+
		"C\3\2\2\2FH\5\f\7\2GF\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IJ\7\13\2\2JK\7\35"+
		"\2\2KL\5 \21\2LM\7\36\2\2M\r\3\2\2\2NO\7\13\2\2OP\7\n\2\2PQ\7\33\2\2Q"+
		"R\5\32\16\2RS\7\34\2\2ST\7\35\2\2TU\5\b\5\2UV\7\36\2\2V\17\3\2\2\2WX\7"+
		"\f\2\2XY\7\33\2\2YZ\5\32\16\2Z[\7\34\2\2[\\\7\35\2\2\\]\5\b\5\2]^\7\36"+
		"\2\2^\21\3\2\2\2_`\5\36\20\2`a\7!\2\2ab\7\26\2\2bc\5\34\17\2cd\7\3\2\2"+
		"d\23\3\2\2\2ef\5\36\20\2fg\7!\2\2gh\7\3\2\2h\25\3\2\2\2ij\7\7\2\2jk\7"+
		"\33\2\2kl\5\34\17\2lm\7\34\2\2mn\7\3\2\2n\27\3\2\2\2op\7!\2\2pq\7\26\2"+
		"\2qr\5\34\17\2rs\7\3\2\2s\31\3\2\2\2tu\b\16\1\2uv\5\34\17\2vw\t\2\2\2"+
		"wx\5\34\17\2x\u0085\3\2\2\2yz\5\34\17\2z{\t\3\2\2{|\5\34\17\2|\u0085\3"+
		"\2\2\2}\u0085\7\b\2\2~\u0085\7\t\2\2\177\u0085\7\"\2\2\u0080\u0081\7\33"+
		"\2\2\u0081\u0082\5\32\16\2\u0082\u0083\7\34\2\2\u0083\u0085\3\2\2\2\u0084"+
		"t\3\2\2\2\u0084y\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177\3\2\2"+
		"\2\u0084\u0080\3\2\2\2\u0085\u008e\3\2\2\2\u0086\u0087\f\n\2\2\u0087\u0088"+
		"\7\16\2\2\u0088\u008d\5\32\16\13\u0089\u008a\f\t\2\2\u008a\u008b\7\r\2"+
		"\2\u008b\u008d\5\32\16\n\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\33\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u0091\u0092\b\17\1\2\u0092\u009b\7\"\2\2\u0093"+
		"\u0094\7\30\2\2\u0094\u009b\7\"\2\2\u0095\u009b\7!\2\2\u0096\u0097\7\33"+
		"\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\34\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0091\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2"+
		"\2\2\u009b\u00a4\3\2\2\2\u009c\u009d\f\b\2\2\u009d\u009e\t\4\2\2\u009e"+
		"\u00a3\5\34\17\t\u009f\u00a0\f\7\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a3\5"+
		"\34\17\b\u00a2\u009c\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\35\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a7\u00a8\7\4\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\5\b\5\2\u00aa!\3\2"+
		"\2\2\f\64\66CG\u0084\u008c\u008e\u009a\u00a2\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}