// Generated from /home/sandesh/Workspace/Coursework/550/projects/PLp2/src/esjc/parser/ExtendedStaticJava.g4 by ANTLR 4.13.1
package esjc.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExtendedStaticJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, ID=49, INT=50, WS=51, ERROR=52;
	public static final int
		RULE_program = 0, RULE_compilationUnit = 1, RULE_classDefinition = 2, 
		RULE_simpleClassDefintion = 3, RULE_publicFieldDeclaration = 4, RULE_memberDeclaration = 5, 
		RULE_mainMethodDeclaration = 6, RULE_fieldDeclaration = 7, RULE_methodDeclaration = 8, 
		RULE_type = 9, RULE_basicType = 10, RULE_arrayType = 11, RULE_returnType = 12, 
		RULE_params = 13, RULE_param = 14, RULE_methodBody = 15, RULE_localDeclaration = 16, 
		RULE_statement = 17, RULE_incDecStatement = 18, RULE_assign = 19, RULE_assignStatement = 20, 
		RULE_lhs = 21, RULE_forStatement = 22, RULE_forInits = 23, RULE_forUpdates = 24, 
		RULE_incDec = 25, RULE_doWhileStatement = 26, RULE_booleanLiteral = 27, 
		RULE_ifStatement = 28, RULE_whileStatement = 29, RULE_invokeExpStatement = 30, 
		RULE_returnStatement = 31, RULE_exp = 32, RULE_arrayInit = 33, RULE_invoke = 34, 
		RULE_args = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "compilationUnit", "classDefinition", "simpleClassDefintion", 
			"publicFieldDeclaration", "memberDeclaration", "mainMethodDeclaration", 
			"fieldDeclaration", "methodDeclaration", "type", "basicType", "arrayType", 
			"returnType", "params", "param", "methodBody", "localDeclaration", "statement", 
			"incDecStatement", "assign", "assignStatement", "lhs", "forStatement", 
			"forInits", "forUpdates", "incDec", "doWhileStatement", "booleanLiteral", 
			"ifStatement", "whileStatement", "invokeExpStatement", "returnStatement", 
			"exp", "arrayInit", "invoke", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'{'", "'}'", "';'", "'static'", "'void'", 
			"'('", "'['", "']'", "')'", "'boolean'", "'int'", "','", "'='", "'.'", 
			"'for'", "'++'", "'--'", "'do'", "'while'", "'true'", "'false'", "'if'", 
			"'else'", "'return'", "'null'", "'-'", "'+'", "'!'", "'~'", "'*'", "'/'", 
			"'%'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'<<'", "'>>'", "'>>>'", "'?'", "':'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "INT", "WS", "ERROR"
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
	public String getGrammarFileName() { return "ExtendedStaticJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExtendedStaticJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public CompilationUnitContext compilationUnit() {
			return getRuleContext(CompilationUnitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExtendedStaticJavaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			compilationUnit();
			setState(73);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public List<SimpleClassDefintionContext> simpleClassDefintion() {
			return getRuleContexts(SimpleClassDefintionContext.class);
		}
		public SimpleClassDefintionContext simpleClassDefintion(int i) {
			return getRuleContext(SimpleClassDefintionContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(75);
				simpleClassDefintion();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			classDefinition();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(82);
				simpleClassDefintion();
				}
				}
				setState(87);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public MainMethodDeclarationContext mainMethodDeclaration() {
			return getRuleContext(MainMethodDeclarationContext.class,0);
		}
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__0);
			setState(89);
			match(T__1);
			setState(90);
			match(ID);
			setState(91);
			match(T__2);
			setState(92);
			mainMethodDeclaration();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(93);
				memberDeclaration();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleClassDefintionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public List<PublicFieldDeclarationContext> publicFieldDeclaration() {
			return getRuleContexts(PublicFieldDeclarationContext.class);
		}
		public PublicFieldDeclarationContext publicFieldDeclaration(int i) {
			return getRuleContext(PublicFieldDeclarationContext.class,i);
		}
		public SimpleClassDefintionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleClassDefintion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterSimpleClassDefintion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitSimpleClassDefintion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitSimpleClassDefintion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleClassDefintionContext simpleClassDefintion() throws RecognitionException {
		SimpleClassDefintionContext _localctx = new SimpleClassDefintionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleClassDefintion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__1);
			setState(102);
			match(ID);
			setState(103);
			match(T__2);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(104);
				publicFieldDeclaration();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PublicFieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public PublicFieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_publicFieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterPublicFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitPublicFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitPublicFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PublicFieldDeclarationContext publicFieldDeclaration() throws RecognitionException {
		PublicFieldDeclarationContext _localctx = new PublicFieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_publicFieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(113);
			type();
			setState(114);
			match(ID);
			setState(115);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberDeclarationContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				methodDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MainMethodDeclarationContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public Token id3;
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public MainMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMainMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMainMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMainMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodDeclarationContext mainMethodDeclaration() throws RecognitionException {
		MainMethodDeclarationContext _localctx = new MainMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__0);
			setState(122);
			match(T__5);
			setState(123);
			match(T__6);
			setState(124);
			((MainMethodDeclarationContext)_localctx).id1 = match(ID);
			setState(125);
			if (!( "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) )) throw new FailedPredicateException(this, " \"main\".equals($id1.text) ");
			setState(126);
			match(T__7);
			setState(127);
			((MainMethodDeclarationContext)_localctx).id2 = match(ID);
			setState(128);
			if (!( "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) )) throw new FailedPredicateException(this, " \"String\".equals($id2.text) ");
			setState(129);
			match(T__8);
			setState(130);
			match(T__9);
			setState(131);
			((MainMethodDeclarationContext)_localctx).id3 = match(ID);
			setState(132);
			match(T__10);
			setState(133);
			match(T__2);
			setState(134);
			methodBody();
			setState(135);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__5);
			setState(138);
			type();
			setState(139);
			match(ID);
			setState(140);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__5);
			setState(143);
			returnType();
			setState(144);
			match(ID);
			setState(145);
			match(T__7);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562949953433600L) != 0)) {
				{
				setState(146);
				params();
				}
			}

			setState(149);
			match(T__10);
			setState(150);
			match(T__2);
			setState(151);
			methodBody();
			setState(152);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public BasicTypeContext typename;
		public Token identifier;
		public ArrayTypeContext arraytype;
		public BasicTypeContext basicType() {
			return getRuleContext(BasicTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(154);
				((TypeContext)_localctx).typename = basicType();
				}
				break;
			case 2:
				{
				setState(155);
				((TypeContext)_localctx).identifier = match(ID);
				}
				break;
			case 3:
				{
				setState(156);
				((TypeContext)_localctx).arraytype = arrayType();
				}
				break;
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T__8);
				setState(160);
				match(T__9);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class BasicTypeContext extends ParserRuleContext {
		public BasicTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicType; }
	 
		public BasicTypeContext() { }
		public void copyFrom(BasicTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTypeContext extends BasicTypeContext {
		public BooleanTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitBooleanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBooleanType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends BasicTypeContext {
		public IntTypeContext(BasicTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicTypeContext basicType() throws RecognitionException {
		BasicTypeContext _localctx = new BasicTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicType);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				_localctx = new BooleanTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__11);
				}
				break;
			case T__12:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ID);
			setState(168);
			match(T__8);
			setState(169);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	 
		public ReturnTypeContext() { }
		public void copyFrom(ReturnTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidTypeContext extends ReturnTypeContext {
		public VoidTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonVoidReturnTypeContext extends ReturnTypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NonVoidReturnTypeContext(ReturnTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNonVoidReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNonVoidReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNonVoidReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnType);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new VoidTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__6);
				}
				break;
			case T__11:
			case T__12:
			case ID:
				_localctx = new NonVoidReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			param();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(176);
				match(T__13);
				setState(177);
				param();
				}
				}
				setState(182);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type();
			setState(184);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public List<LocalDeclarationContext> localDeclaration() {
			return getRuleContexts(LocalDeclarationContext.class);
		}
		public LocalDeclarationContext localDeclaration(int i) {
			return getRuleContext(LocalDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					localDeclaration();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329097470208L) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public LocalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterLocalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitLocalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLocalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationContext localDeclaration() throws RecognitionException {
		LocalDeclarationContext _localctx = new LocalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_localDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			type();
			setState(199);
			match(ID);
			setState(200);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public InvokeExpStatementContext invokeExpStatement() {
			return getRuleContext(InvokeExpStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public IncDecStatementContext incDecStatement() {
			return getRuleContext(IncDecStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				assignStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				invokeExpStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				doWhileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				incDecStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncDecStatementContext extends ParserRuleContext {
		public IncDecContext incDec() {
			return getRuleContext(IncDecContext.class,0);
		}
		public IncDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIncDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIncDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecStatementContext incDecStatement() throws RecognitionException {
		IncDecStatementContext _localctx = new IncDecStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_incDecStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			incDec();
			setState(213);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			lhs();
			setState(216);
			match(T__14);
			setState(217);
			exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			assign();
			setState(220);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterLhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitLhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsContext lhs() throws RecognitionException {
		LhsContext _localctx = new LhsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lhs);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				exp(0);
				setState(224);
				match(T__15);
				setState(225);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				exp(0);
				setState(228);
				match(T__8);
				setState(229);
				exp(0);
				setState(230);
				match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForInitsContext forInits() {
			return getRuleContext(ForInitsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ForUpdatesContext forUpdates() {
			return getRuleContext(ForUpdatesContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__16);
			setState(235);
			match(T__7);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329010307328L) != 0)) {
				{
				setState(236);
				forInits();
				}
			}

			setState(239);
			match(T__4);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329010307328L) != 0)) {
				{
				setState(240);
				exp(0);
				}
			}

			setState(243);
			match(T__4);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329010307328L) != 0)) {
				{
				setState(244);
				forUpdates();
				}
			}

			setState(247);
			match(T__10);
			setState(248);
			match(T__2);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329097470208L) != 0)) {
				{
				{
				setState(249);
				statement();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public ForInitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForInits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForInits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForInits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitsContext forInits() throws RecognitionException {
		ForInitsContext _localctx = new ForInitsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_forInits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			assign();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(258);
				match(T__13);
				setState(259);
				assign();
				}
				}
				setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdatesContext extends ParserRuleContext {
		public List<IncDecContext> incDec() {
			return getRuleContexts(IncDecContext.class);
		}
		public IncDecContext incDec(int i) {
			return getRuleContext(IncDecContext.class,i);
		}
		public ForUpdatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterForUpdates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitForUpdates(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitForUpdates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdatesContext forUpdates() throws RecognitionException {
		ForUpdatesContext _localctx = new ForUpdatesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_forUpdates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			incDec();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(266);
				match(T__13);
				setState(267);
				incDec();
				}
				}
				setState(272);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncDecContext extends ParserRuleContext {
		public LhsContext lhs() {
			return getRuleContext(LhsContext.class,0);
		}
		public IncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncDecContext incDec() throws RecognitionException {
		IncDecContext _localctx = new IncDecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_incDec);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				lhs();
				setState(274);
				match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				lhs();
				setState(277);
				match(T__18);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> contents = new ArrayList<StatementContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doWhileStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__19);
			setState(282);
			match(T__2);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					((DoWhileStatementContext)_localctx).statement = statement();
					((DoWhileStatementContext)_localctx).contents.add(((DoWhileStatementContext)_localctx).statement);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(289);
				match(T__3);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__20);
			setState(296);
			match(T__7);
			setState(297);
			exp(0);
			setState(298);
			match(T__10);
			setState(299);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends BooleanLiteralContext {
		public TrueLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends BooleanLiteralContext {
		public FalseLiteralContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanLiteral);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(T__21);
				}
				break;
			case T__22:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement;
		public List<StatementContext> ts = new ArrayList<StatementContext>();
		public List<StatementContext> fs = new ArrayList<StatementContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__23);
			setState(306);
			match(T__7);
			setState(307);
			exp(0);
			setState(308);
			match(T__10);
			setState(309);
			match(T__2);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329097470208L) != 0)) {
				{
				{
				setState(310);
				((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).ts.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(T__3);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(317);
				match(T__24);
				setState(318);
				match(T__2);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329097470208L) != 0)) {
					{
					{
					setState(319);
					((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).fs.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__20);
			setState(329);
			match(T__7);
			setState(330);
			exp(0);
			setState(331);
			match(T__10);
			setState(332);
			match(T__2);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329097470208L) != 0)) {
				{
				{
				setState(333);
				statement();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpStatementContext extends ParserRuleContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invokeExpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvokeExpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvokeExpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeExpStatementContext invokeExpStatement() throws RecognitionException {
		InvokeExpStatementContext _localctx = new InvokeExpStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_invokeExpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			invoke();
			setState(342);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__25);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329010307328L) != 0)) {
				{
				setState(345);
				exp(0);
				}
			}

			setState(348);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpContext extends ExpContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public LiteralExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitLiteralExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitLiteralExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpContext extends ExpContext {
		public ExpContext id;
		public ExpContext inner;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayAccessExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayAccessExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayAccessExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayAccessExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvokeExpContext extends ExpContext {
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvokeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvokeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvokeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftLeftExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ShiftLeftExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterShiftLeftExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitShiftLeftExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitShiftLeftExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnsignedShiftRightExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public UnsignedShiftRightExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterUnsignedShiftRightExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitUnsignedShiftRightExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnsignedShiftRightExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreationExpContext extends ExpContext {
		public TypeContext typeid;
		public ArrayInitContext initexpr;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayInitContext arrayInit() {
			return getRuleContext(ArrayInitContext.class,0);
		}
		public ArrayCreationExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayCreationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayCreationExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayCreationExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterBinaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitBinaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitBinaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExpContext extends ExpContext {
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public IdExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIdExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIdExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIdExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExpContext extends ExpContext {
		public ExpContext condition;
		public ExpContext p1;
		public ExpContext p2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public CondExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterCondExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitCondExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitCondExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterParenExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitParenExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitParenExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftRightExpContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ShiftRightExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterShiftRightExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitShiftRightExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitShiftRightExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpContext {
		public Token INT;
		public TerminalNode INT() { return getToken(ExtendedStaticJavaParser.INT, 0); }
		public IntLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessExpContext extends ExpContext {
		public ExpContext e1;
		public Token id;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public FieldAccessExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterFieldAccessExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitFieldAccessExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitFieldAccessExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ExpContext {
		public NullLiteralContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewExpContext extends ExpContext {
		public Token name;
		public TerminalNode ID() { return getToken(ExtendedStaticJavaParser.ID, 0); }
		public NewExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterNewExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitNewExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitNewExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(351);
				((IntLiteralContext)_localctx).INT = match(INT);
				setState(352);
				if (!( new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 )) throw new FailedPredicateException(this, " new java.math.BigInteger($INT.text).bitLength() < 32 ");
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				booleanLiteral();
				}
				break;
			case 3:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(T__26);
				}
				break;
			case 4:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				match(T__7);
				setState(356);
				exp(0);
				setState(357);
				match(T__10);
				}
				break;
			case 5:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				invoke();
				}
				break;
			case 6:
				{
				_localctx = new IdExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				exp(16);
				}
				break;
			case 8:
				{
				_localctx = new NewExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(T__47);
				setState(364);
				((NewExpContext)_localctx).name = match(ID);
				setState(365);
				match(T__7);
				setState(366);
				match(T__10);
				}
				break;
			case 9:
				{
				_localctx = new ArrayCreationExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367);
				match(T__47);
				setState(368);
				((ArrayCreationExpContext)_localctx).typeid = type();
				setState(369);
				match(T__8);
				setState(370);
				exp(0);
				setState(371);
				match(T__9);
				}
				break;
			case 10:
				{
				_localctx = new ArrayCreationExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(373);
				match(T__47);
				setState(374);
				((ArrayCreationExpContext)_localctx).typeid = type();
				setState(375);
				match(T__8);
				setState(376);
				match(T__9);
				setState(377);
				((ArrayCreationExpContext)_localctx).initexpr = arrayInit();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(422);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(381);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(382);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						((BinaryExpContext)_localctx).e2 = exp(16);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(384);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(385);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						((BinaryExpContext)_localctx).e2 = exp(15);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(387);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(388);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(389);
						((BinaryExpContext)_localctx).e2 = exp(14);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(390);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(391);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(392);
						((BinaryExpContext)_localctx).e2 = exp(13);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(393);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(394);
						((BinaryExpContext)_localctx).op = match(T__40);
						setState(395);
						((BinaryExpContext)_localctx).e2 = exp(12);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(396);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(397);
						((BinaryExpContext)_localctx).op = match(T__41);
						setState(398);
						((BinaryExpContext)_localctx).e2 = exp(11);
						}
						break;
					case 7:
						{
						_localctx = new ShiftLeftExpContext(new ExpContext(_parentctx, _parentState));
						((ShiftLeftExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(399);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(400);
						((ShiftLeftExpContext)_localctx).op = match(T__42);
						setState(401);
						((ShiftLeftExpContext)_localctx).e2 = exp(10);
						}
						break;
					case 8:
						{
						_localctx = new ShiftRightExpContext(new ExpContext(_parentctx, _parentState));
						((ShiftRightExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(402);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(403);
						((ShiftRightExpContext)_localctx).op = match(T__43);
						setState(404);
						((ShiftRightExpContext)_localctx).e2 = exp(9);
						}
						break;
					case 9:
						{
						_localctx = new UnsignedShiftRightExpContext(new ExpContext(_parentctx, _parentState));
						((UnsignedShiftRightExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(405);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(406);
						((UnsignedShiftRightExpContext)_localctx).op = match(T__44);
						setState(407);
						((UnsignedShiftRightExpContext)_localctx).e2 = exp(8);
						}
						break;
					case 10:
						{
						_localctx = new CondExpContext(new ExpContext(_parentctx, _parentState));
						((CondExpContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(408);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(409);
						match(T__45);
						setState(410);
						((CondExpContext)_localctx).p1 = exp(0);
						setState(411);
						match(T__46);
						setState(412);
						((CondExpContext)_localctx).p2 = exp(7);
						}
						break;
					case 11:
						{
						_localctx = new FieldAccessExpContext(new ExpContext(_parentctx, _parentState));
						((FieldAccessExpContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(414);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(415);
						match(T__15);
						setState(416);
						((FieldAccessExpContext)_localctx).id = match(ID);
						}
						break;
					case 12:
						{
						_localctx = new ArrayAccessExpContext(new ExpContext(_parentctx, _parentState));
						((ArrayAccessExpContext)_localctx).id = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(417);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(418);
						match(T__8);
						setState(419);
						((ArrayAccessExpContext)_localctx).inner = exp(0);
						setState(420);
						match(T__9);
						}
						break;
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArrayInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArrayInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArrayInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArrayInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitContext arrayInit() throws RecognitionException {
		ArrayInitContext _localctx = new ArrayInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__2);
			setState(428);
			exp(0);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(429);
				match(T__13);
				setState(430);
				exp(0);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InvokeContext extends ParserRuleContext {
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(ExtendedStaticJavaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExtendedStaticJavaParser.ID, i);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterInvoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitInvoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitInvoke(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_invoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(438);
				((InvokeContext)_localctx).id1 = match(ID);
				setState(439);
				match(T__15);
				}
				break;
			}
			setState(442);
			((InvokeContext)_localctx).id2 = match(ID);
			setState(443);
			match(T__7);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970329010307328L) != 0)) {
				{
				setState(444);
				args();
				}
			}

			setState(447);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExtendedStaticJavaListener ) ((ExtendedStaticJavaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExtendedStaticJavaVisitor ) return ((ExtendedStaticJavaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			exp(0);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(450);
				match(T__13);
				setState(451);
				exp(0);
				}
				}
				setState(456);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return mainMethodDeclaration_sempred((MainMethodDeclarationContext)_localctx, predIndex);
		case 32:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mainMethodDeclaration_sempred(MainMethodDeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  "main".equals((((MainMethodDeclarationContext)_localctx).id1!=null?((MainMethodDeclarationContext)_localctx).id1.getText():null)) ;
		case 1:
			return  "String".equals((((MainMethodDeclarationContext)_localctx).id2!=null?((MainMethodDeclarationContext)_localctx).id2.getText():null)) ;
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return  new java.math.BigInteger((((IntLiteralContext)_localctx).INT!=null?((IntLiteralContext)_localctx).INT.getText():null)).bitLength() < 32 ;
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u01ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001M"+
		"\b\u0001\n\u0001\f\u0001P\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"T\b\u0001\n\u0001\f\u0001W\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002"+
		"b\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003j\b\u0003\n\u0003\f\u0003m\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0094\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009e\b\t\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\n\u0001\n\u0003\n"+
		"\u00a6\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b3\b\r\n\r\f\r"+
		"\u00b6\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0005\u000f"+
		"\u00bc\b\u000f\n\u000f\f\u000f\u00bf\t\u000f\u0001\u000f\u0005\u000f\u00c2"+
		"\b\u000f\n\u000f\f\u000f\u00c5\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d3\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00e9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00ee\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f2\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f6\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00fb\b\u0016\n\u0016\f\u0016\u00fe\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u0105\b\u0017\n\u0017\f\u0017\u0108\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u010d\b\u0018\n\u0018\f\u0018\u0110\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0118\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u011d\b"+
		"\u001a\n\u001a\f\u001a\u0120\t\u001a\u0001\u001a\u0005\u001a\u0123\b\u001a"+
		"\n\u001a\f\u001a\u0126\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0130"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0138\b\u001c\n\u001c\f\u001c\u013b\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0141\b\u001c\n\u001c"+
		"\f\u001c\u0144\t\u001c\u0001\u001c\u0003\u001c\u0147\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u014f\b\u001d\n\u001d\f\u001d\u0152\t\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u015b"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u017c\b \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01a7\b \n \f \u01aa"+
		"\t \u0001!\u0001!\u0001!\u0001!\u0005!\u01b0\b!\n!\f!\u01b3\t!\u0001!"+
		"\u0001!\u0001\"\u0001\"\u0003\"\u01b9\b\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u01be\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u01c5\b#\n#\f"+
		"#\u01c8\t#\u0001#\u0000\u0001@$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000"+
		"\u0005\u0001\u0000\u001c\u001f\u0001\u0000 \"\u0001\u0000\u001c\u001d"+
		"\u0001\u0000#&\u0001\u0000\'(\u01e4\u0000H\u0001\u0000\u0000\u0000\u0002"+
		"N\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006e\u0001"+
		"\u0000\u0000\u0000\bp\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000"+
		"\fy\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010"+
		"\u008e\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014"+
		"\u00a5\u0001\u0000\u0000\u0000\u0016\u00a7\u0001\u0000\u0000\u0000\u0018"+
		"\u00ad\u0001\u0000\u0000\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c"+
		"\u00b7\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000 \u00c6"+
		"\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00d4\u0001"+
		"\u0000\u0000\u0000&\u00d7\u0001\u0000\u0000\u0000(\u00db\u0001\u0000\u0000"+
		"\u0000*\u00e8\u0001\u0000\u0000\u0000,\u00ea\u0001\u0000\u0000\u0000."+
		"\u0101\u0001\u0000\u0000\u00000\u0109\u0001\u0000\u0000\u00002\u0117\u0001"+
		"\u0000\u0000\u00004\u0119\u0001\u0000\u0000\u00006\u012f\u0001\u0000\u0000"+
		"\u00008\u0131\u0001\u0000\u0000\u0000:\u0148\u0001\u0000\u0000\u0000<"+
		"\u0155\u0001\u0000\u0000\u0000>\u0158\u0001\u0000\u0000\u0000@\u017b\u0001"+
		"\u0000\u0000\u0000B\u01ab\u0001\u0000\u0000\u0000D\u01b8\u0001\u0000\u0000"+
		"\u0000F\u01c1\u0001\u0000\u0000\u0000HI\u0003\u0002\u0001\u0000IJ\u0005"+
		"\u0000\u0000\u0001J\u0001\u0001\u0000\u0000\u0000KM\u0003\u0006\u0003"+
		"\u0000LK\u0001\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000QU\u0003\u0004\u0002\u0000RT\u0003\u0006\u0003\u0000"+
		"SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000V\u0003\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XY\u0005\u0001\u0000\u0000YZ\u0005\u0002\u0000\u0000"+
		"Z[\u00051\u0000\u0000[\\\u0005\u0003\u0000\u0000\\`\u0003\f\u0006\u0000"+
		"]_\u0003\n\u0005\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000cd\u0005\u0004\u0000\u0000d\u0005\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0002\u0000\u0000fg\u00051\u0000\u0000gk\u0005"+
		"\u0003\u0000\u0000hj\u0003\b\u0004\u0000ih\u0001\u0000\u0000\u0000jm\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0004\u0000"+
		"\u0000o\u0007\u0001\u0000\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0003"+
		"\u0012\t\u0000rs\u00051\u0000\u0000st\u0005\u0005\u0000\u0000t\t\u0001"+
		"\u0000\u0000\u0000ux\u0003\u000e\u0007\u0000vx\u0003\u0010\b\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u000b\u0001\u0000\u0000"+
		"\u0000yz\u0005\u0001\u0000\u0000z{\u0005\u0006\u0000\u0000{|\u0005\u0007"+
		"\u0000\u0000|}\u00051\u0000\u0000}~\u0004\u0006\u0000\u0001~\u007f\u0005"+
		"\b\u0000\u0000\u007f\u0080\u00051\u0000\u0000\u0080\u0081\u0004\u0006"+
		"\u0001\u0001\u0081\u0082\u0005\t\u0000\u0000\u0082\u0083\u0005\n\u0000"+
		"\u0000\u0083\u0084\u00051\u0000\u0000\u0084\u0085\u0005\u000b\u0000\u0000"+
		"\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0003\u001e\u000f\u0000"+
		"\u0087\u0088\u0005\u0004\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u0006\u0000\u0000\u008a\u008b\u0003\u0012\t\u0000\u008b\u008c"+
		"\u00051\u0000\u0000\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u000f\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0003"+
		"\u0018\f\u0000\u0090\u0091\u00051\u0000\u0000\u0091\u0093\u0005\b\u0000"+
		"\u0000\u0092\u0094\u0003\u001a\r\u0000\u0093\u0092\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u000b\u0000\u0000\u0096\u0097\u0005\u0003\u0000\u0000"+
		"\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0005\u0004\u0000\u0000"+
		"\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009e\u0003\u0014\n\u0000\u009b"+
		"\u009e\u00051\u0000\u0000\u009c\u009e\u0003\u0016\u000b\u0000\u009d\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005\t\u0000\u0000\u00a0\u00a2\u0005\n\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0013\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a6\u0005\f\u0000\u0000\u00a4\u00a6\u0005\r"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u0015\u0001\u0000\u0000\u0000\u00a7\u00a8\u00051\u0000"+
		"\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000"+
		"\u00aa\u0017\u0001\u0000\u0000\u0000\u00ab\u00ae\u0005\u0007\u0000\u0000"+
		"\u00ac\u00ae\u0003\u0012\t\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af"+
		"\u00b4\u0003\u001c\u000e\u0000\u00b0\u00b1\u0005\u000e\u0000\u0000\u00b1"+
		"\u00b3\u0003\u001c\u000e\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u001b\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0012\t\u0000\u00b8\u00b9"+
		"\u00051\u0000\u0000\u00b9\u001d\u0001\u0000\u0000\u0000\u00ba\u00bc\u0003"+
		" \u0010\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c3\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c2\u0003\"\u0011\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u001f\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u0012\t\u0000"+
		"\u00c7\u00c8\u00051\u0000\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9"+
		"!\u0001\u0000\u0000\u0000\u00ca\u00d3\u0003(\u0014\u0000\u00cb\u00d3\u0003"+
		"8\u001c\u0000\u00cc\u00d3\u0003:\u001d\u0000\u00cd\u00d3\u0003<\u001e"+
		"\u0000\u00ce\u00d3\u0003>\u001f\u0000\u00cf\u00d3\u0003,\u0016\u0000\u00d0"+
		"\u00d3\u00034\u001a\u0000\u00d1\u00d3\u0003$\u0012\u0000\u00d2\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3#\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u00032\u0019\u0000\u00d5\u00d6\u0005\u0005\u0000"+
		"\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003*\u0015\u0000\u00d8"+
		"\u00d9\u0005\u000f\u0000\u0000\u00d9\u00da\u0003@ \u0000\u00da\'\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003&\u0013\u0000\u00dc\u00dd\u0005\u0005"+
		"\u0000\u0000\u00dd)\u0001\u0000\u0000\u0000\u00de\u00e9\u00051\u0000\u0000"+
		"\u00df\u00e0\u0003@ \u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1\u00e2"+
		"\u00051\u0000\u0000\u00e2\u00e9\u0001\u0000\u0000\u0000\u00e3\u00e4\u0003"+
		"@ \u0000\u00e4\u00e5\u0005\t\u0000\u0000\u00e5\u00e6\u0003@ \u0000\u00e6"+
		"\u00e7\u0005\n\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00de"+
		"\u0001\u0000\u0000\u0000\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e9+\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"\u0011\u0000\u0000\u00eb\u00ed\u0005\b\u0000\u0000\u00ec\u00ee\u0003."+
		"\u0017\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005\u0005"+
		"\u0000\u0000\u00f0\u00f2\u0003@ \u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f5\u0005\u0005\u0000\u0000\u00f4\u00f6\u00030\u0018\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u000b\u0000\u0000\u00f8"+
		"\u00fc\u0005\u0003\u0000\u0000\u00f9\u00fb\u0003\"\u0011\u0000\u00fa\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0005\u0004\u0000\u0000\u0100-\u0001\u0000\u0000\u0000\u0101\u0106\u0003"+
		"&\u0013\u0000\u0102\u0103\u0005\u000e\u0000\u0000\u0103\u0105\u0003&\u0013"+
		"\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107/\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010e\u00032\u0019\u0000\u010a\u010b\u0005\u000e\u0000\u0000\u010b"+
		"\u010d\u00032\u0019\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0110"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f1\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0003*\u0015\u0000\u0112\u0113\u0005\u0012"+
		"\u0000\u0000\u0113\u0118\u0001\u0000\u0000\u0000\u0114\u0115\u0003*\u0015"+
		"\u0000\u0115\u0116\u0005\u0013\u0000\u0000\u0116\u0118\u0001\u0000\u0000"+
		"\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000"+
		"\u0000\u01183\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0014\u0000\u0000"+
		"\u011a\u011e\u0005\u0003\u0000\u0000\u011b\u011d\u0003\"\u0011\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u0124\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0005\u0004\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		"\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0015\u0000\u0000\u0128"+
		"\u0129\u0005\b\u0000\u0000\u0129\u012a\u0003@ \u0000\u012a\u012b\u0005"+
		"\u000b\u0000\u0000\u012b\u012c\u0005\u0005\u0000\u0000\u012c5\u0001\u0000"+
		"\u0000\u0000\u012d\u0130\u0005\u0016\u0000\u0000\u012e\u0130\u0005\u0017"+
		"\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000"+
		"\u0000\u0000\u01307\u0001\u0000\u0000\u0000\u0131\u0132\u0005\u0018\u0000"+
		"\u0000\u0132\u0133\u0005\b\u0000\u0000\u0133\u0134\u0003@ \u0000\u0134"+
		"\u0135\u0005\u000b\u0000\u0000\u0135\u0139\u0005\u0003\u0000\u0000\u0136"+
		"\u0138\u0003\"\u0011\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u0146\u0005\u0004\u0000\u0000\u013d\u013e"+
		"\u0005\u0019\u0000\u0000\u013e\u0142\u0005\u0003\u0000\u0000\u013f\u0141"+
		"\u0003\"\u0011\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001"+
		"\u0000\u0000\u0000\u0145\u0147\u0005\u0004\u0000\u0000\u0146\u013d\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u01479\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005\u0015\u0000\u0000\u0149\u014a\u0005\b\u0000"+
		"\u0000\u014a\u014b\u0003@ \u0000\u014b\u014c\u0005\u000b\u0000\u0000\u014c"+
		"\u0150\u0005\u0003\u0000\u0000\u014d\u014f\u0003\"\u0011\u0000\u014e\u014d"+
		"\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0005\u0004\u0000\u0000\u0154;\u0001\u0000\u0000\u0000\u0155\u0156\u0003"+
		"D\"\u0000\u0156\u0157\u0005\u0005\u0000\u0000\u0157=\u0001\u0000\u0000"+
		"\u0000\u0158\u015a\u0005\u001a\u0000\u0000\u0159\u015b\u0003@ \u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0005\u0005\u0000\u0000\u015d"+
		"?\u0001\u0000\u0000\u0000\u015e\u015f\u0006 \uffff\uffff\u0000\u015f\u0160"+
		"\u00052\u0000\u0000\u0160\u017c\u0004 \u0002\u0001\u0161\u017c\u00036"+
		"\u001b\u0000\u0162\u017c\u0005\u001b\u0000\u0000\u0163\u0164\u0005\b\u0000"+
		"\u0000\u0164\u0165\u0003@ \u0000\u0165\u0166\u0005\u000b\u0000\u0000\u0166"+
		"\u017c\u0001\u0000\u0000\u0000\u0167\u017c\u0003D\"\u0000\u0168\u017c"+
		"\u00051\u0000\u0000\u0169\u016a\u0007\u0000\u0000\u0000\u016a\u017c\u0003"+
		"@ \u0010\u016b\u016c\u00050\u0000\u0000\u016c\u016d\u00051\u0000\u0000"+
		"\u016d\u016e\u0005\b\u0000\u0000\u016e\u017c\u0005\u000b\u0000\u0000\u016f"+
		"\u0170\u00050\u0000\u0000\u0170\u0171\u0003\u0012\t\u0000\u0171\u0172"+
		"\u0005\t\u0000\u0000\u0172\u0173\u0003@ \u0000\u0173\u0174\u0005\n\u0000"+
		"\u0000\u0174\u017c\u0001\u0000\u0000\u0000\u0175\u0176\u00050\u0000\u0000"+
		"\u0176\u0177\u0003\u0012\t\u0000\u0177\u0178\u0005\t\u0000\u0000\u0178"+
		"\u0179\u0005\n\u0000\u0000\u0179\u017a\u0003B!\u0000\u017a\u017c\u0001"+
		"\u0000\u0000\u0000\u017b\u015e\u0001\u0000\u0000\u0000\u017b\u0161\u0001"+
		"\u0000\u0000\u0000\u017b\u0162\u0001\u0000\u0000\u0000\u017b\u0163\u0001"+
		"\u0000\u0000\u0000\u017b\u0167\u0001\u0000\u0000\u0000\u017b\u0168\u0001"+
		"\u0000\u0000\u0000\u017b\u0169\u0001\u0000\u0000\u0000\u017b\u016b\u0001"+
		"\u0000\u0000\u0000\u017b\u016f\u0001\u0000\u0000\u0000\u017b\u0175\u0001"+
		"\u0000\u0000\u0000\u017c\u01a8\u0001\u0000\u0000\u0000\u017d\u017e\n\u000f"+
		"\u0000\u0000\u017e\u017f\u0007\u0001\u0000\u0000\u017f\u01a7\u0003@ \u0010"+
		"\u0180\u0181\n\u000e\u0000\u0000\u0181\u0182\u0007\u0002\u0000\u0000\u0182"+
		"\u01a7\u0003@ \u000f\u0183\u0184\n\r\u0000\u0000\u0184\u0185\u0007\u0003"+
		"\u0000\u0000\u0185\u01a7\u0003@ \u000e\u0186\u0187\n\f\u0000\u0000\u0187"+
		"\u0188\u0007\u0004\u0000\u0000\u0188\u01a7\u0003@ \r\u0189\u018a\n\u000b"+
		"\u0000\u0000\u018a\u018b\u0005)\u0000\u0000\u018b\u01a7\u0003@ \f\u018c"+
		"\u018d\n\n\u0000\u0000\u018d\u018e\u0005*\u0000\u0000\u018e\u01a7\u0003"+
		"@ \u000b\u018f\u0190\n\t\u0000\u0000\u0190\u0191\u0005+\u0000\u0000\u0191"+
		"\u01a7\u0003@ \n\u0192\u0193\n\b\u0000\u0000\u0193\u0194\u0005,\u0000"+
		"\u0000\u0194\u01a7\u0003@ \t\u0195\u0196\n\u0007\u0000\u0000\u0196\u0197"+
		"\u0005-\u0000\u0000\u0197\u01a7\u0003@ \b\u0198\u0199\n\u0006\u0000\u0000"+
		"\u0199\u019a\u0005.\u0000\u0000\u019a\u019b\u0003@ \u0000\u019b\u019c"+
		"\u0005/\u0000\u0000\u019c\u019d\u0003@ \u0007\u019d\u01a7\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\n\u0005\u0000\u0000\u019f\u01a0\u0005\u0010\u0000"+
		"\u0000\u01a0\u01a7\u00051\u0000\u0000\u01a1\u01a2\n\u0004\u0000\u0000"+
		"\u01a2\u01a3\u0005\t\u0000\u0000\u01a3\u01a4\u0003@ \u0000\u01a4\u01a5"+
		"\u0005\n\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u017d\u0001"+
		"\u0000\u0000\u0000\u01a6\u0180\u0001\u0000\u0000\u0000\u01a6\u0183\u0001"+
		"\u0000\u0000\u0000\u01a6\u0186\u0001\u0000\u0000\u0000\u01a6\u0189\u0001"+
		"\u0000\u0000\u0000\u01a6\u018c\u0001\u0000\u0000\u0000\u01a6\u018f\u0001"+
		"\u0000\u0000\u0000\u01a6\u0192\u0001\u0000\u0000\u0000\u01a6\u0195\u0001"+
		"\u0000\u0000\u0000\u01a6\u0198\u0001\u0000\u0000\u0000\u01a6\u019e\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a1\u0001\u0000\u0000\u0000\u01a7\u01aa\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9A\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005\u0003\u0000\u0000\u01ac\u01b1\u0003@ \u0000"+
		"\u01ad\u01ae\u0005\u000e\u0000\u0000\u01ae\u01b0\u0003@ \u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0005\u0004\u0000\u0000\u01b5C\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005"+
		"1\u0000\u0000\u01b7\u01b9\u0005\u0010\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01bb\u00051\u0000\u0000\u01bb\u01bd\u0005\b\u0000"+
		"\u0000\u01bc\u01be\u0003F#\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0005\u000b\u0000\u0000\u01c0E\u0001\u0000\u0000\u0000\u01c1\u01c6"+
		"\u0003@ \u0000\u01c2\u01c3\u0005\u000e\u0000\u0000\u01c3\u01c5\u0003@"+
		" \u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c7G\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"%NU`kw\u0093\u009d\u00a1\u00a5\u00ad\u00b4\u00bd\u00c3\u00d2\u00e8\u00ed"+
		"\u00f1\u00f5\u00fc\u0106\u010e\u0117\u011e\u0124\u012f\u0139\u0142\u0146"+
		"\u0150\u015a\u017b\u01a6\u01a8\u01b1\u01b8\u01bd\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}