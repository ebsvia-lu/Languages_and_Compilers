// Generated from /Users/ebeetiobhio/Downloads/Languages and Compilers/src/assignment2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assignment2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, END=5, NOT=6, AND=7, OR=8, TRUE=9, FALSE=10, 
		MODE=11, BEGIN=12, ENDING=13, BRAC=14, KETS=15, PRINT=16, SKP=17, ASSIGN=18, 
		DOLLAR=19, MULT=20, DIV=21, ADD=22, SUB=23, SEMICOLON=24, LS=25, LSQ=26, 
		EQU=27, GR=28, GRQ=29, NUM=30, FLOAT=31, VAR=32, WS=33;
	public static final int
		RULE_start = 0, RULE_stmt = 1, RULE_expr = 2, RULE_boolExp = 3, RULE_figure = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stmt", "expr", "boolExp", "figure"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'while'", "'end'", "'not'", "'and'", 
			"'or'", "'True'", "'False'", "'%'", "'{'", "'}'", "'('", "')'", "'print'", 
			"'skip'", "':='", "'$'", "'*'", "'/'", "'+'", "'-'", "';'", "'<'", "'<='", 
			"'=='", "'>'", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "WHILE", "END", "NOT", "AND", "OR", "TRUE", 
			"FALSE", "MODE", "BEGIN", "ENDING", "BRAC", "KETS", "PRINT", "SKP", "ASSIGN", 
			"DOLLAR", "MULT", "DIV", "ADD", "SUB", "SEMICOLON", "LS", "LSQ", "EQU", 
			"GR", "GRQ", "NUM", "FLOAT", "VAR", "WS"
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
	public String getGrammarFileName() { return "assignment2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public assignment2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
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
	public static class CompStmtContext extends StmtContext {
		public TerminalNode BEGIN() { return getToken(assignment2Parser.BEGIN, 0); }
		public TerminalNode ENDING() { return getToken(assignment2Parser.ENDING, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public CompStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterCompStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitCompStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitCompStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends StmtContext {
		public TerminalNode SKP() { return getToken(assignment2Parser.SKP, 0); }
		public SkipContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExpContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(assignment2Parser.PRINT, 0); }
		public TerminalNode BRAC() { return getToken(assignment2Parser.BRAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KETS() { return getToken(assignment2Parser.KETS, 0); }
		public PrintExpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterPrintExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitPrintExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitPrintExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintBoolContext extends StmtContext {
		public TerminalNode PRINT() { return getToken(assignment2Parser.PRINT, 0); }
		public TerminalNode BRAC() { return getToken(assignment2Parser.BRAC, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode KETS() { return getToken(assignment2Parser.KETS, 0); }
		public PrintBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterPrintBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitPrintBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitPrintBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(assignment2Parser.WHILE, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StmtContext {
		public TerminalNode VAR() { return getToken(assignment2Parser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(assignment2Parser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends StmtContext {
		public TerminalNode IF() { return getToken(assignment2Parser.IF, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(assignment2Parser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(assignment2Parser.ELSE, 0); }
		public IfelseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(VAR);
				setState(13);
				match(ASSIGN);
				setState(14);
				expr(0);
				}
				break;
			case 2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				match(SKP);
				}
				break;
			case 3:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(IF);
				setState(17);
				boolExp(0);
				setState(18);
				match(THEN);
				setState(19);
				stmt();
				setState(20);
				match(ELSE);
				setState(21);
				stmt();
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				match(WHILE);
				setState(24);
				boolExp(0);
				setState(25);
				stmt();
				}
				break;
			case 5:
				_localctx = new PrintExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(PRINT);
				setState(28);
				match(BRAC);
				setState(29);
				expr(0);
				setState(30);
				match(KETS);
				}
				break;
			case 6:
				_localctx = new PrintBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(32);
				match(PRINT);
				setState(33);
				match(BRAC);
				setState(34);
				boolExp(0);
				setState(35);
				match(KETS);
				}
				break;
			case 7:
				_localctx = new CompStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(37);
				match(BEGIN);
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(38);
					stmt();
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << BEGIN) | (1L << PRINT) | (1L << SKP) | (1L << VAR))) != 0) );
				setState(43);
				match(ENDING);
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
	public static class NumberContext extends ExprContext {
		public FigureContext figure() {
			return getRuleContext(FigureContext.class,0);
		}
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode VAR() { return getToken(assignment2Parser.VAR, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpContext extends ExprContext {
		public TerminalNode SUB() { return getToken(assignment2Parser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterNegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitNegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitNegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(assignment2Parser.MULT, 0); }
		public TerminalNode DIV() { return getToken(assignment2Parser.DIV, 0); }
		public TerminalNode MODE() { return getToken(assignment2Parser.MODE, 0); }
		public MultiplicativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends ExprContext {
		public TerminalNode BRAC() { return getToken(assignment2Parser.BRAC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode KETS() { return getToken(assignment2Parser.KETS, 0); }
		public BracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterBrackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitBrackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(assignment2Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(assignment2Parser.SUB, 0); }
		public AdditiveContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitAdditive(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case FLOAT:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48);
				figure();
				}
				break;
			case BRAC:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(BRAC);
				setState(50);
				expr(0);
				setState(51);
				match(KETS);
				}
				break;
			case VAR:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(VAR);
				}
				break;
			case SUB:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(SUB);
				setState(55);
				expr(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(64);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeContext(new ExprContext(_parentctx, _parentState));
						((MultiplicativeContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(58);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(59);
						((MultiplicativeContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MODE) | (1L << MULT) | (1L << DIV))) != 0)) ) {
							((MultiplicativeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(60);
						((MultiplicativeContext)_localctx).right = expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveContext(new ExprContext(_parentctx, _parentState));
						((AdditiveContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(61);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(62);
						((AdditiveContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AdditiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(63);
						((AdditiveContext)_localctx).right = expr(6);
						}
						break;
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class BoolExpContext extends ParserRuleContext {
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
	 
		public BoolExpContext() { }
		public void copyFrom(BoolExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolOpContext extends BoolExpContext {
		public BoolExpContext left;
		public Token op;
		public BoolExpContext right;
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(assignment2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(assignment2Parser.OR, 0); }
		public BoolOpContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends BoolExpContext {
		public TerminalNode TRUE() { return getToken(assignment2Parser.TRUE, 0); }
		public TrueContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends BoolExpContext {
		public TerminalNode FALSE() { return getToken(assignment2Parser.FALSE, 0); }
		public FalseContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegBoolContext extends BoolExpContext {
		public TerminalNode NOT() { return getToken(assignment2Parser.NOT, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public NegBoolContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterNegBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitNegBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitNegBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends BoolExpContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LS() { return getToken(assignment2Parser.LS, 0); }
		public TerminalNode LSQ() { return getToken(assignment2Parser.LSQ, 0); }
		public TerminalNode EQU() { return getToken(assignment2Parser.EQU, 0); }
		public TerminalNode GR() { return getToken(assignment2Parser.GR, 0); }
		public TerminalNode GRQ() { return getToken(assignment2Parser.GRQ, 0); }
		public RelationalContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(70);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(FALSE);
				}
				break;
			case NOT:
				{
				_localctx = new NegBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(NOT);
				setState(73);
				boolExp(3);
				}
				break;
			case BRAC:
			case SUB:
			case NUM:
			case FLOAT:
			case VAR:
				{
				_localctx = new RelationalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				((RelationalContext)_localctx).left = expr(0);
				setState(75);
				((RelationalContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LS) | (1L << LSQ) | (1L << EQU) | (1L << GR) | (1L << GRQ))) != 0)) ) {
					((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(76);
				((RelationalContext)_localctx).right = expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolOpContext(new BoolExpContext(_parentctx, _parentState));
					((BoolOpContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(80);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(81);
					((BoolOpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((BoolOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(82);
					((BoolOpContext)_localctx).right = boolExp(3);
					}
					} 
				}
				setState(87);
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

	public static class FigureContext extends ParserRuleContext {
		public FigureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_figure; }
	 
		public FigureContext() { }
		public void copyFrom(FigureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegerContext extends FigureContext {
		public TerminalNode NUM() { return getToken(assignment2Parser.NUM, 0); }
		public IntegerContext(FigureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends FigureContext {
		public TerminalNode FLOAT() { return getToken(assignment2Parser.FLOAT, 0); }
		public FloatContext(FigureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof assignment2Listener ) ((assignment2Listener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignment2Visitor ) return ((assignment2Visitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FigureContext figure() throws RecognitionException {
		FigureContext _localctx = new FigureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_figure);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(FLOAT);
				}
				break;
			case NUM:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(NUM);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 3:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#_\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3*\n\3\r\3\16\3+\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13"+
		"\5\3\6\3\6\5\6]\n\6\3\6\2\4\6\b\7\2\4\6\b\n\2\6\4\2\r\r\26\27\3\2\30\31"+
		"\3\2\33\37\3\2\t\n\2j\2\f\3\2\2\2\4/\3\2\2\2\6:\3\2\2\2\bP\3\2\2\2\n\\"+
		"\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\17\7\"\2\2\17\20\7\24\2\2\20\60\5"+
		"\6\4\2\21\60\7\23\2\2\22\23\7\3\2\2\23\24\5\b\5\2\24\25\7\4\2\2\25\26"+
		"\5\4\3\2\26\27\7\5\2\2\27\30\5\4\3\2\30\60\3\2\2\2\31\32\7\6\2\2\32\33"+
		"\5\b\5\2\33\34\5\4\3\2\34\60\3\2\2\2\35\36\7\22\2\2\36\37\7\20\2\2\37"+
		" \5\6\4\2 !\7\21\2\2!\60\3\2\2\2\"#\7\22\2\2#$\7\20\2\2$%\5\b\5\2%&\7"+
		"\21\2\2&\60\3\2\2\2\')\7\16\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2"+
		"\2+,\3\2\2\2,-\3\2\2\2-.\7\17\2\2.\60\3\2\2\2/\16\3\2\2\2/\21\3\2\2\2"+
		"/\22\3\2\2\2/\31\3\2\2\2/\35\3\2\2\2/\"\3\2\2\2/\'\3\2\2\2\60\5\3\2\2"+
		"\2\61\62\b\4\1\2\62;\5\n\6\2\63\64\7\20\2\2\64\65\5\6\4\2\65\66\7\21\2"+
		"\2\66;\3\2\2\2\67;\7\"\2\289\7\31\2\29;\5\6\4\3:\61\3\2\2\2:\63\3\2\2"+
		"\2:\67\3\2\2\2:8\3\2\2\2;D\3\2\2\2<=\f\b\2\2=>\t\2\2\2>C\5\6\4\t?@\f\7"+
		"\2\2@A\t\3\2\2AC\5\6\4\bB<\3\2\2\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2"+
		"\2\2E\7\3\2\2\2FD\3\2\2\2GH\b\5\1\2HQ\7\13\2\2IQ\7\f\2\2JK\7\b\2\2KQ\5"+
		"\b\5\5LM\5\6\4\2MN\t\4\2\2NO\5\6\4\2OQ\3\2\2\2PG\3\2\2\2PI\3\2\2\2PJ\3"+
		"\2\2\2PL\3\2\2\2QW\3\2\2\2RS\f\4\2\2ST\t\5\2\2TV\5\b\5\5UR\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\t\3\2\2\2YW\3\2\2\2Z]\7!\2\2[]\7 \2\2\\Z\3"+
		"\2\2\2\\[\3\2\2\2]\13\3\2\2\2\n+/:BDPW\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}