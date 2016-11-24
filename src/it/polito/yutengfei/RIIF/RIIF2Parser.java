// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V3/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RIIF2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, COMPONENT=44, END_COMPONENT=45, 
		ENVIRONMENT=46, END_ENVIRONMENT=47, REQUIREMENT=48, END_REQUIREMENT=49, 
		CHILD_COMPONENT=50, FAIL_MODE=51, EXTENDS=52, ASSIGN=53, ASSERT=54, INPUT=55, 
		OUTPUT=56, PARAMETER=57, CONSTANT=58, TYPE_FLOAT=59, TYPE_INTEGER=60, 
		TYPE_STRING=61, TYPE_ENUM=62, FUNC_AGG_SINGLE=63, FUNC_GT_N_FAIL=64, FUNC_LOG=65, 
		FUNC_EXP=66, TEMPLATE=67, END_TEMPLATE=68, IMPOSE=69, ABSTRACT=70, IMPLEMENTS=71, 
		SELF=72, SET=73, TYPE_TABLE=74, PLATFORM=75, StringLiteral=76, FloatingPointLiteral=77, 
		DecimalLiteral=78, Ident=79, HierIdent=80, AttrIdent=81, AssocDecl=82, 
		AssocInstanceIdent=83, AssocHierIdent=84, AssocAttrIdent=85, WS=86, COMMENT=87, 
		LINE_COMMENT=88;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_templateDecl = 2, RULE_templateBodyElement = 3, 
		RULE_abstractDecl = 4, RULE_abstractFailModeDecl = 5, RULE_abstractConstanceDecl = 6, 
		RULE_abstractParameterDecl = 7, RULE_abstractAttributeDecl = 8, RULE_abstractPlatformDecl = 9, 
		RULE_imposeAssignment = 10, RULE_componentDecl = 11, RULE_componentBodyElement = 12, 
		RULE_setTemplate = 13, RULE_environmentDecl = 14, RULE_environmentBodyElements = 15, 
		RULE_requirementDecl = 16, RULE_parameterDecl = 17, RULE_envParameterDecl = 18, 
		RULE_constanceDecl = 19, RULE_childComponentDecl = 20, RULE_failModeDecl = 21, 
		RULE_assignment = 22, RULE_assertion = 23, RULE_expression = 24, RULE_primary = 25, 
		RULE_listConstructor = 26, RULE_arrayConstructor = 27, RULE_constructorType = 28, 
		RULE_tableColumns = 29, RULE_attrIdent = 30, RULE_funcCall = 31, RULE_funcName = 32, 
		RULE_funcArg = 33, RULE_literal = 34, RULE_complexType = 35, RULE_vector = 36, 
		RULE_primitiveType = 37, RULE_enumType = 38;
	public static final String[] ruleNames = {
		"program", "declaration", "templateDecl", "templateBodyElement", "abstractDecl", 
		"abstractFailModeDecl", "abstractConstanceDecl", "abstractParameterDecl", 
		"abstractAttributeDecl", "abstractPlatformDecl", "imposeAssignment", "componentDecl", 
		"componentBodyElement", "setTemplate", "environmentDecl", "environmentBodyElements", 
		"requirementDecl", "parameterDecl", "envParameterDecl", "constanceDecl", 
		"childComponentDecl", "failModeDecl", "assignment", "assertion", "expression", 
		"primary", "listConstructor", "arrayConstructor", "constructorType", "tableColumns", 
		"attrIdent", "funcCall", "funcName", "funcArg", "literal", "complexType", 
		"vector", "primitiveType", "enumType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "':='", "'='", "','", "'<'", "'>'", "'+'", "'-'", 
		"'~'", "'!'", "'*'", "'/'", "'%'", "'<='", "'>='", "'=='", "'!='", "'&'", 
		"'^'", "'|'", "'&&'", "'||'", "'?'", "'+='", "'-='", "'*='", "'/='", "'&='", 
		"'|='", "'^='", "'>>='", "'>>>='", "'<<='", "'%='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'#'", "'''", "'component'", "'endcomponent'", "'environment'", 
		"'endenvironment'", "'requirement'", "'endrequirement'", "'child_component'", 
		"'fail_mode'", "'extends'", "'assign'", "'assert'", "'input'", "'output'", 
		"'parameter'", "'constant'", "'float'", "'integer'", "'string'", "'enum'", 
		"'agg_single_fail'", "'agg_gt_n_fail'", "'LOG'", "'EXP'", "'template'", 
		"'endtemplate'", "'impose'", "'abstract'", "'implements'", "'self'", "'set'", 
		"'table'", "'platform'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMPONENT", "END_COMPONENT", 
		"ENVIRONMENT", "END_ENVIRONMENT", "REQUIREMENT", "END_REQUIREMENT", "CHILD_COMPONENT", 
		"FAIL_MODE", "EXTENDS", "ASSIGN", "ASSERT", "INPUT", "OUTPUT", "PARAMETER", 
		"CONSTANT", "TYPE_FLOAT", "TYPE_INTEGER", "TYPE_STRING", "TYPE_ENUM", 
		"FUNC_AGG_SINGLE", "FUNC_GT_N_FAIL", "FUNC_LOG", "FUNC_EXP", "TEMPLATE", 
		"END_TEMPLATE", "IMPOSE", "ABSTRACT", "IMPLEMENTS", "SELF", "SET", "TYPE_TABLE", 
		"PLATFORM", "StringLiteral", "FloatingPointLiteral", "DecimalLiteral", 
		"Ident", "HierIdent", "AttrIdent", "AssocDecl", "AssocInstanceIdent", 
		"AssocHierIdent", "AssocAttrIdent", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "RIIF2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RIIF2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RIIF2Parser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				declaration();
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMPONENT - 44)) | (1L << (ENVIRONMENT - 44)) | (1L << (REQUIREMENT - 44)) | (1L << (TEMPLATE - 44)))) != 0) );
			setState(83);
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

	public static class DeclarationContext extends ParserRuleContext {
		public ComponentDeclContext componentDecl() {
			return getRuleContext(ComponentDeclContext.class,0);
		}
		public EnvironmentDeclContext environmentDecl() {
			return getRuleContext(EnvironmentDeclContext.class,0);
		}
		public RequirementDeclContext requirementDecl() {
			return getRuleContext(RequirementDeclContext.class,0);
		}
		public TemplateDeclContext templateDecl() {
			return getRuleContext(TemplateDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case COMPONENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				componentDecl();
				}
				break;
			case ENVIRONMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				environmentDecl();
				}
				break;
			case REQUIREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				requirementDecl();
				}
				break;
			case TEMPLATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				templateDecl();
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

	public static class TemplateDeclContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(RIIF2Parser.TEMPLATE, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode END_TEMPLATE() { return getToken(RIIF2Parser.END_TEMPLATE, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public List<TemplateBodyElementContext> templateBodyElement() {
			return getRuleContexts(TemplateBodyElementContext.class);
		}
		public TemplateBodyElementContext templateBodyElement(int i) {
			return getRuleContext(TemplateBodyElementContext.class,i);
		}
		public TemplateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateDecl(this);
		}
	}

	public final TemplateDeclContext templateDecl() throws RecognitionException {
		TemplateDeclContext _localctx = new TemplateDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_templateDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TEMPLATE);
			setState(92);
			match(Ident);
			setState(95);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(93);
				match(EXTENDS);
				setState(94);
				match(Ident);
				}
			}

			setState(97);
			match(T__0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (FAIL_MODE - 51)) | (1L << (IMPOSE - 51)) | (1L << (ABSTRACT - 51)))) != 0)) {
				{
				{
				setState(98);
				templateBodyElement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(END_TEMPLATE);
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

	public static class TemplateBodyElementContext extends ParserRuleContext {
		public AbstractDeclContext abstractDecl() {
			return getRuleContext(AbstractDeclContext.class,0);
		}
		public ImposeAssignmentContext imposeAssignment() {
			return getRuleContext(ImposeAssignmentContext.class,0);
		}
		public TemplateBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTemplateBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTemplateBodyElement(this);
		}
	}

	public final TemplateBodyElementContext templateBodyElement() throws RecognitionException {
		TemplateBodyElementContext _localctx = new TemplateBodyElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_templateBodyElement);
		try {
			setState(108);
			switch (_input.LA(1)) {
			case FAIL_MODE:
			case ABSTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				abstractDecl();
				}
				break;
			case IMPOSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				imposeAssignment();
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

	public static class AbstractDeclContext extends ParserRuleContext {
		public AbstractConstanceDeclContext abstractConstanceDecl() {
			return getRuleContext(AbstractConstanceDeclContext.class,0);
		}
		public AbstractParameterDeclContext abstractParameterDecl() {
			return getRuleContext(AbstractParameterDeclContext.class,0);
		}
		public AbstractAttributeDeclContext abstractAttributeDecl() {
			return getRuleContext(AbstractAttributeDeclContext.class,0);
		}
		public AbstractPlatformDeclContext abstractPlatformDecl() {
			return getRuleContext(AbstractPlatformDeclContext.class,0);
		}
		public AbstractFailModeDeclContext abstractFailModeDecl() {
			return getRuleContext(AbstractFailModeDeclContext.class,0);
		}
		public FailModeDeclContext failModeDecl() {
			return getRuleContext(FailModeDeclContext.class,0);
		}
		public AbstractDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractDecl(this);
		}
	}

	public final AbstractDeclContext abstractDecl() throws RecognitionException {
		AbstractDeclContext _localctx = new AbstractDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_abstractDecl);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				abstractConstanceDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				abstractParameterDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				abstractAttributeDecl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				abstractPlatformDecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				abstractFailModeDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				failModeDecl();
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

	public static class AbstractFailModeDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public AbstractFailModeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFailModeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractFailModeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractFailModeDecl(this);
		}
	}

	public final AbstractFailModeDeclContext abstractFailModeDecl() throws RecognitionException {
		AbstractFailModeDeclContext _localctx = new AbstractFailModeDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_abstractFailModeDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ABSTRACT);
			setState(119);
			match(FAIL_MODE);
			setState(120);
			match(Ident);
			setState(121);
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

	public static class AbstractConstanceDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public AbstractConstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractConstanceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractConstanceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractConstanceDecl(this);
		}
	}

	public final AbstractConstanceDeclContext abstractConstanceDecl() throws RecognitionException {
		AbstractConstanceDeclContext _localctx = new AbstractConstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_abstractConstanceDecl);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ABSTRACT);
				setState(124);
				match(CONSTANT);
				setState(125);
				match(Ident);
				setState(126);
				match(T__1);
				setState(127);
				primitiveType();
				setState(130);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(128);
					match(T__2);
					setState(129);
					expression(0);
					}
				}

				setState(132);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(ABSTRACT);
				setState(135);
				match(CONSTANT);
				setState(136);
				match(Ident);
				setState(137);
				match(T__2);
				setState(138);
				listConstructor();
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

	public static class AbstractParameterDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public AbstractParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractParameterDecl(this);
		}
	}

	public final AbstractParameterDeclContext abstractParameterDecl() throws RecognitionException {
		AbstractParameterDeclContext _localctx = new AbstractParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_abstractParameterDecl);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(ABSTRACT);
				setState(142);
				match(PARAMETER);
				setState(143);
				match(Ident);
				setState(144);
				match(T__1);
				setState(145);
				complexType();
				setState(148);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(146);
					match(T__2);
					setState(147);
					expression(0);
					}
				}

				setState(150);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ABSTRACT);
				setState(153);
				match(PARAMETER);
				setState(154);
				match(Ident);
				setState(155);
				match(T__2);
				setState(156);
				listConstructor();
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

	public static class AbstractAttributeDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public AbstractAttributeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractAttributeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractAttributeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractAttributeDecl(this);
		}
	}

	public final AbstractAttributeDeclContext abstractAttributeDecl() throws RecognitionException {
		AbstractAttributeDeclContext _localctx = new AbstractAttributeDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abstractAttributeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ABSTRACT);
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==AttrIdent || _la==AssocAttrIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(161);
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

	public static class AbstractPlatformDeclContext extends ParserRuleContext {
		public TerminalNode ABSTRACT() { return getToken(RIIF2Parser.ABSTRACT, 0); }
		public TerminalNode PLATFORM() { return getToken(RIIF2Parser.PLATFORM, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public AbstractPlatformDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractPlatformDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAbstractPlatformDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAbstractPlatformDecl(this);
		}
	}

	public final AbstractPlatformDeclContext abstractPlatformDecl() throws RecognitionException {
		AbstractPlatformDeclContext _localctx = new AbstractPlatformDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_abstractPlatformDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ABSTRACT);
			setState(164);
			match(PLATFORM);
			setState(165);
			match(Ident);
			setState(166);
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

	public static class ImposeAssignmentContext extends ParserRuleContext {
		public TerminalNode IMPOSE() { return getToken(RIIF2Parser.IMPOSE, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ImposeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imposeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterImposeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitImposeAssignment(this);
		}
	}

	public final ImposeAssignmentContext imposeAssignment() throws RecognitionException {
		ImposeAssignmentContext _localctx = new ImposeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_imposeAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IMPOSE);
			setState(169);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Ident - 79)) | (1L << (HierIdent - 79)) | (1L << (AttrIdent - 79)) | (1L << (AssocInstanceIdent - 79)) | (1L << (AssocHierIdent - 79)) | (1L << (AssocAttrIdent - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(171);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(170);
				vector();
				}
			}

			setState(173);
			match(T__3);
			setState(176);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__35:
			case T__39:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				{
				setState(174);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(175);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
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

	public static class ComponentDeclContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(RIIF2Parser.COMPONENT, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode END_COMPONENT() { return getToken(RIIF2Parser.END_COMPONENT, 0); }
		public TerminalNode EXTENDS() { return getToken(RIIF2Parser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(RIIF2Parser.IMPLEMENTS, 0); }
		public List<ComponentBodyElementContext> componentBodyElement() {
			return getRuleContexts(ComponentBodyElementContext.class);
		}
		public ComponentBodyElementContext componentBodyElement(int i) {
			return getRuleContext(ComponentBodyElementContext.class,i);
		}
		public ComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentDecl(this);
		}
	}

	public final ComponentDeclContext componentDecl() throws RecognitionException {
		ComponentDeclContext _localctx = new ComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_componentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COMPONENT);
			setState(181);
			match(Ident);
			setState(191);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(182);
				match(EXTENDS);
				setState(183);
				match(Ident);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(184);
					match(T__4);
					setState(185);
					match(Ident);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(202);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(193);
				match(IMPLEMENTS);
				setState(194);
				match(Ident);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(195);
					match(T__4);
					setState(196);
					match(Ident);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			match(T__0);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (CHILD_COMPONENT - 50)) | (1L << (FAIL_MODE - 50)) | (1L << (ASSIGN - 50)) | (1L << (ASSERT - 50)) | (1L << (PARAMETER - 50)) | (1L << (CONSTANT - 50)) | (1L << (SET - 50)))) != 0)) {
				{
				{
				setState(205);
				componentBodyElement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(END_COMPONENT);
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

	public static class ComponentBodyElementContext extends ParserRuleContext {
		public ParameterDeclContext parameterDecl() {
			return getRuleContext(ParameterDeclContext.class,0);
		}
		public ConstanceDeclContext constanceDecl() {
			return getRuleContext(ConstanceDeclContext.class,0);
		}
		public ChildComponentDeclContext childComponentDecl() {
			return getRuleContext(ChildComponentDeclContext.class,0);
		}
		public FailModeDeclContext failModeDecl() {
			return getRuleContext(FailModeDeclContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetTemplateContext setTemplate() {
			return getRuleContext(SetTemplateContext.class,0);
		}
		public AssertionContext assertion() {
			return getRuleContext(AssertionContext.class,0);
		}
		public ComponentBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBodyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComponentBodyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComponentBodyElement(this);
		}
	}

	public final ComponentBodyElementContext componentBodyElement() throws RecognitionException {
		ComponentBodyElementContext _localctx = new ComponentBodyElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentBodyElement);
		try {
			setState(220);
			switch (_input.LA(1)) {
			case PARAMETER:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				parameterDecl();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				constanceDecl();
				}
				break;
			case CHILD_COMPONENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				childComponentDecl();
				}
				break;
			case FAIL_MODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				failModeDecl();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				assignment();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				setTemplate();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 7);
				{
				setState(219);
				assertion();
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

	public static class SetTemplateContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(RIIF2Parser.SET, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public SetTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterSetTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitSetTemplate(this);
		}
	}

	public final SetTemplateContext setTemplate() throws RecognitionException {
		SetTemplateContext _localctx = new SetTemplateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(SET);
			setState(223);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Ident - 79)) | (1L << (HierIdent - 79)) | (1L << (AttrIdent - 79)) | (1L << (AssocInstanceIdent - 79)) | (1L << (AssocHierIdent - 79)) | (1L << (AssocAttrIdent - 79)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(224);
			match(T__3);
			setState(227);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__35:
			case T__39:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				{
				setState(225);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(226);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
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

	public static class EnvironmentDeclContext extends ParserRuleContext {
		public TerminalNode ENVIRONMENT() { return getToken(RIIF2Parser.ENVIRONMENT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode END_ENVIRONMENT() { return getToken(RIIF2Parser.END_ENVIRONMENT, 0); }
		public List<EnvironmentBodyElementsContext> environmentBodyElements() {
			return getRuleContexts(EnvironmentBodyElementsContext.class);
		}
		public EnvironmentBodyElementsContext environmentBodyElements(int i) {
			return getRuleContext(EnvironmentBodyElementsContext.class,i);
		}
		public EnvironmentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentDecl(this);
		}
	}

	public final EnvironmentDeclContext environmentDecl() throws RecognitionException {
		EnvironmentDeclContext _localctx = new EnvironmentDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_environmentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ENVIRONMENT);
			setState(232);
			match(Ident);
			setState(233);
			match(T__0);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(234);
				environmentBodyElements();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(END_ENVIRONMENT);
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

	public static class EnvironmentBodyElementsContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EnvParameterDeclContext envParameterDecl() {
			return getRuleContext(EnvParameterDeclContext.class,0);
		}
		public EnvironmentBodyElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_environmentBodyElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvironmentBodyElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvironmentBodyElements(this);
		}
	}

	public final EnvironmentBodyElementsContext environmentBodyElements() throws RecognitionException {
		EnvironmentBodyElementsContext _localctx = new EnvironmentBodyElementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_environmentBodyElements);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				assignment();
				}
				break;
			case INPUT:
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				envParameterDecl();
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

	public static class RequirementDeclContext extends ParserRuleContext {
		public TerminalNode REQUIREMENT() { return getToken(RIIF2Parser.REQUIREMENT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode END_REQUIREMENT() { return getToken(RIIF2Parser.END_REQUIREMENT, 0); }
		public List<AssertionContext> assertion() {
			return getRuleContexts(AssertionContext.class);
		}
		public AssertionContext assertion(int i) {
			return getRuleContext(AssertionContext.class,i);
		}
		public RequirementDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterRequirementDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitRequirementDecl(this);
		}
	}

	public final RequirementDeclContext requirementDecl() throws RecognitionException {
		RequirementDeclContext _localctx = new RequirementDeclContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_requirementDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(REQUIREMENT);
			setState(247);
			match(Ident);
			setState(248);
			match(T__0);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSERT) {
				{
				{
				setState(249);
				assertion();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(END_REQUIREMENT);
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

	public static class ParameterDeclContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameterDecl);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(PARAMETER);
				setState(258);
				match(Ident);
				setState(259);
				match(T__1);
				setState(260);
				complexType();
				setState(263);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(261);
					match(T__2);
					setState(262);
					expression(0);
					}
				}

				setState(265);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(PARAMETER);
				setState(268);
				match(AssocDecl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(PARAMETER);
				setState(270);
				match(Ident);
				setState(271);
				match(T__2);
				setState(272);
				listConstructor();
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

	public static class EnvParameterDeclContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(RIIF2Parser.PARAMETER, 0); }
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public TerminalNode INPUT() { return getToken(RIIF2Parser.INPUT, 0); }
		public TerminalNode OUTPUT() { return getToken(RIIF2Parser.OUTPUT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnvParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envParameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnvParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnvParameterDecl(this);
		}
	}

	public final EnvParameterDeclContext envParameterDecl() throws RecognitionException {
		EnvParameterDeclContext _localctx = new EnvParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_envParameterDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==INPUT || _la==OUTPUT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(276);
			match(PARAMETER);
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(278);
			match(T__1);
			setState(279);
			complexType();
			setState(282);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(280);
				match(T__2);
				setState(281);
				expression(0);
				}
			}

			setState(284);
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

	public static class ConstanceDeclContext extends ParserRuleContext {
		public TerminalNode CONSTANT() { return getToken(RIIF2Parser.CONSTANT, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public ConstanceDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanceDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterConstanceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitConstanceDecl(this);
		}
	}

	public final ConstanceDeclContext constanceDecl() throws RecognitionException {
		ConstanceDeclContext _localctx = new ConstanceDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constanceDecl);
		int _la;
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(CONSTANT);
				setState(287);
				match(Ident);
				setState(288);
				match(T__1);
				setState(289);
				primitiveType();
				setState(292);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(290);
					match(T__2);
					setState(291);
					expression(0);
					}
				}

				setState(294);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(CONSTANT);
				setState(297);
				match(AssocDecl);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(CONSTANT);
				setState(299);
				match(Ident);
				setState(300);
				match(T__2);
				setState(301);
				listConstructor();
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

	public static class ChildComponentDeclContext extends ParserRuleContext {
		public TerminalNode CHILD_COMPONENT() { return getToken(RIIF2Parser.CHILD_COMPONENT, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ChildComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childComponentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterChildComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitChildComponentDecl(this);
		}
	}

	public final ChildComponentDeclContext childComponentDecl() throws RecognitionException {
		ChildComponentDeclContext _localctx = new ChildComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_childComponentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(CHILD_COMPONENT);
			setState(305);
			match(Ident);
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(308);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(307);
				vector();
				}
			}

			setState(310);
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

	public static class FailModeDeclContext extends ParserRuleContext {
		public TerminalNode FAIL_MODE() { return getToken(RIIF2Parser.FAIL_MODE, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode AssocDecl() { return getToken(RIIF2Parser.AssocDecl, 0); }
		public FailModeDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failModeDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFailModeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFailModeDecl(this);
		}
	}

	public final FailModeDeclContext failModeDecl() throws RecognitionException {
		FailModeDeclContext _localctx = new FailModeDeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_failModeDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FAIL_MODE);
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==AssocDecl) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(314);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(RIIF2Parser.ASSIGN, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public AttrIdentContext attrIdent() {
			return getRuleContext(AttrIdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(ASSIGN);
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(317);
				match(Ident);
				}
				break;
			case 2:
				{
				setState(318);
				match(HierIdent);
				}
				break;
			case 3:
				{
				setState(319);
				match(AttrIdent);
				}
				break;
			case 4:
				{
				setState(320);
				match(AssocInstanceIdent);
				}
				break;
			case 5:
				{
				setState(321);
				match(AssocAttrIdent);
				}
				break;
			case 6:
				{
				setState(322);
				match(AssocHierIdent);
				}
				break;
			case 7:
				{
				setState(323);
				attrIdent();
				}
				break;
			}
			setState(327);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(326);
				vector();
				}
			}

			setState(329);
			match(T__3);
			setState(332);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__35:
			case T__39:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				{
				setState(330);
				expression(0);
				}
				break;
			case T__37:
				{
				setState(331);
				listConstructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(334);
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

	public static class AssertionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(RIIF2Parser.ASSERT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public AssertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAssertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAssertion(this);
		}
	}

	public final AssertionContext assertion() throws RecognitionException {
		AssertionContext _localctx = new AssertionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assertion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(ASSERT);
			{
			setState(337);
			match(AttrIdent);
			}
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(339);
			expression(0);
			setState(340);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			switch (_input.LA(1)) {
			case T__35:
			case T__39:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				{
				setState(343);
				primary();
				}
				break;
			case T__7:
			case T__8:
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(345);
				expression(14);
				}
				break;
			case T__9:
			case T__10:
				{
				setState(346);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(347);
				expression(13);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(351);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(352);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(354);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(355);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(364);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(357);
							match(T__5);
							setState(358);
							match(T__5);
							}
							break;
						case 2:
							{
							setState(359);
							match(T__6);
							setState(360);
							match(T__6);
							setState(361);
							match(T__6);
							}
							break;
						case 3:
							{
							setState(362);
							match(T__6);
							setState(363);
							match(T__6);
							}
							break;
						}
						setState(366);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(368);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__14) | (1L << T__15))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(369);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(370);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(371);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(372);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(374);
						match(T__18);
						setState(375);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(376);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(377);
						match(T__19);
						setState(378);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(379);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(380);
						match(T__20);
						setState(381);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(382);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(383);
						match(T__21);
						setState(384);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(385);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(386);
						match(T__22);
						setState(387);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(388);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(389);
						match(T__23);
						setState(390);
						expression(0);
						setState(391);
						match(T__1);
						setState(392);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(394);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(395);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(396);
						expression(1);
						}
						break;
					}
					} 
				}
				setState(401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(RIIF2Parser.SELF, 0); }
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public TerminalNode AssocInstanceIdent() { return getToken(RIIF2Parser.AssocInstanceIdent, 0); }
		public TerminalNode AssocAttrIdent() { return getToken(RIIF2Parser.AssocAttrIdent, 0); }
		public TerminalNode AssocHierIdent() { return getToken(RIIF2Parser.AssocHierIdent, 0); }
		public AttrIdentContext attrIdent() {
			return getRuleContext(AttrIdentContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrayConstructorContext arrayConstructor() {
			return getRuleContext(ArrayConstructorContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(T__35);
				setState(403);
				expression(0);
				setState(404);
				match(T__36);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(SELF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(407);
				match(Ident);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(HierIdent);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(409);
				match(AttrIdent);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(410);
				match(AssocInstanceIdent);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(411);
				match(AssocAttrIdent);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(412);
				match(AssocHierIdent);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(413);
				attrIdent();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(414);
				literal();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(415);
				funcCall();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(416);
				arrayConstructor();
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

	public static class ListConstructorContext extends ParserRuleContext {
		public List<ConstructorTypeContext> constructorType() {
			return getRuleContexts(ConstructorTypeContext.class);
		}
		public ConstructorTypeContext constructorType(int i) {
			return getRuleContext(ConstructorTypeContext.class,i);
		}
		public ListConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterListConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitListConstructor(this);
		}
	}

	public final ListConstructorContext listConstructor() throws RecognitionException {
		ListConstructorContext _localctx = new ListConstructorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__37);
			setState(420);
			constructorType();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(421);
				match(T__4);
				setState(422);
				constructorType();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__38);
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

	public static class ArrayConstructorContext extends ParserRuleContext {
		public List<ConstructorTypeContext> constructorType() {
			return getRuleContexts(ConstructorTypeContext.class);
		}
		public ConstructorTypeContext constructorType(int i) {
			return getRuleContext(ConstructorTypeContext.class,i);
		}
		public ArrayConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitArrayConstructor(this);
		}
	}

	public final ArrayConstructorContext arrayConstructor() throws RecognitionException {
		ArrayConstructorContext _localctx = new ArrayConstructorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arrayConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__39);
			setState(431);
			constructorType();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(432);
				match(T__4);
				setState(433);
				constructorType();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(T__40);
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

	public static class ConstructorTypeContext extends ParserRuleContext {
		public ListConstructorContext listConstructor() {
			return getRuleContext(ListConstructorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterConstructorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitConstructorType(this);
		}
	}

	public final ConstructorTypeContext constructorType() throws RecognitionException {
		ConstructorTypeContext _localctx = new ConstructorTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorType);
		try {
			setState(443);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				listConstructor();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__35:
			case T__39:
			case FUNC_AGG_SINGLE:
			case FUNC_GT_N_FAIL:
			case FUNC_LOG:
			case FUNC_EXP:
			case SELF:
			case StringLiteral:
			case FloatingPointLiteral:
			case DecimalLiteral:
			case Ident:
			case HierIdent:
			case AttrIdent:
			case AssocInstanceIdent:
			case AssocHierIdent:
			case AssocAttrIdent:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				expression(0);
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

	public static class TableColumnsContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TableColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitTableColumns(this);
		}
	}

	public final TableColumnsContext tableColumns() throws RecognitionException {
		TableColumnsContext _localctx = new TableColumnsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tableColumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T__39);
			setState(446);
			match(T__41);
			setState(447);
			match(T__40);
			setState(448);
			match(T__39);
			setState(449);
			match(Ident);
			setState(450);
			match(T__40);
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

	public static class AttrIdentContext extends ParserRuleContext {
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TableColumnsContext tableColumns() {
			return getRuleContext(TableColumnsContext.class,0);
		}
		public AttrIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterAttrIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitAttrIdent(this);
		}
	}

	public final AttrIdentContext attrIdent() throws RecognitionException {
		AttrIdentContext _localctx = new AttrIdentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_attrIdent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==Ident || _la==HierIdent) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(453);
			match(T__42);
			{
			setState(454);
			match(Ident);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(455);
				tableColumns();
				}
				break;
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

	public static class FuncCallContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<FuncArgContext> funcArg() {
			return getRuleContexts(FuncArgContext.class);
		}
		public FuncArgContext funcArg(int i) {
			return getRuleContext(FuncArgContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			funcName();
			setState(459);
			match(T__35);
			setState(460);
			funcArg();
			setState(463);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(461);
				match(T__4);
				setState(462);
				funcArg();
				}
			}

			setState(465);
			match(T__36);
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

	public static class FuncNameContext extends ParserRuleContext {
		public TerminalNode FUNC_LOG() { return getToken(RIIF2Parser.FUNC_LOG, 0); }
		public TerminalNode FUNC_EXP() { return getToken(RIIF2Parser.FUNC_EXP, 0); }
		public TerminalNode FUNC_AGG_SINGLE() { return getToken(RIIF2Parser.FUNC_AGG_SINGLE, 0); }
		public TerminalNode FUNC_GT_N_FAIL() { return getToken(RIIF2Parser.FUNC_GT_N_FAIL, 0); }
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncName(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funcName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (FUNC_AGG_SINGLE - 63)) | (1L << (FUNC_GT_N_FAIL - 63)) | (1L << (FUNC_LOG - 63)) | (1L << (FUNC_EXP - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class FuncArgContext extends ParserRuleContext {
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public TerminalNode HierIdent() { return getToken(RIIF2Parser.HierIdent, 0); }
		public TerminalNode AttrIdent() { return getToken(RIIF2Parser.AttrIdent, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterFuncArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitFuncArg(this);
		}
	}

	public final FuncArgContext funcArg() throws RecognitionException {
		FuncArgContext _localctx = new FuncArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_funcArg);
		int _la;
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				_la = _input.LA(1);
				if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (Ident - 79)) | (1L << (HierIdent - 79)) | (1L << (AttrIdent - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(470);
				vector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				expression(0);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(RIIF2Parser.StringLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(RIIF2Parser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(RIIF2Parser.FloatingPointLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (StringLiteral - 76)) | (1L << (FloatingPointLiteral - 76)) | (1L << (DecimalLiteral - 76)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class ComplexTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public TerminalNode Ident() { return getToken(RIIF2Parser.Ident, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitComplexType(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_complexType);
		try {
			setState(479);
			switch (_input.LA(1)) {
			case TYPE_FLOAT:
			case TYPE_INTEGER:
			case TYPE_STRING:
			case TYPE_TABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				primitiveType();
				}
				break;
			case TYPE_ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				enumType();
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(Ident);
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

	public static class VectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitVector(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_vector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__39);
			setState(482);
			expression(0);
			setState(483);
			match(T__1);
			setState(484);
			expression(0);
			setState(485);
			match(T__40);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_FLOAT() { return getToken(RIIF2Parser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_INTEGER() { return getToken(RIIF2Parser.TYPE_INTEGER, 0); }
		public TerminalNode TYPE_STRING() { return getToken(RIIF2Parser.TYPE_STRING, 0); }
		public TerminalNode TYPE_TABLE() { return getToken(RIIF2Parser.TYPE_TABLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (TYPE_FLOAT - 59)) | (1L << (TYPE_INTEGER - 59)) | (1L << (TYPE_STRING - 59)) | (1L << (TYPE_TABLE - 59)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class EnumTypeContext extends ParserRuleContext {
		public TerminalNode TYPE_ENUM() { return getToken(RIIF2Parser.TYPE_ENUM, 0); }
		public List<TerminalNode> Ident() { return getTokens(RIIF2Parser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(RIIF2Parser.Ident, i);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RIIF2Listener ) ((RIIF2Listener)listener).exitEnumType(this);
		}
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(TYPE_ENUM);
			setState(490);
			match(T__37);
			setState(491);
			match(Ident);
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(492);
				match(T__4);
				setState(493);
				match(Ident);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			match(T__38);
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
		case 24:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Z\u01f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2R\n\2\r\2\16"+
		"\2S\3\2\3\2\3\3\3\3\3\3\3\3\5\3\\\n\3\3\4\3\4\3\4\3\4\5\4b\n\4\3\4\3\4"+
		"\7\4f\n\4\f\4\16\4i\13\4\3\4\3\4\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0097\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\f"+
		"\5\f\u00b3\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bd\n\r\f\r\16\r"+
		"\u00c0\13\r\5\r\u00c2\n\r\3\r\3\r\3\r\3\r\7\r\u00c8\n\r\f\r\16\r\u00cb"+
		"\13\r\5\r\u00cd\n\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00df\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e6\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00ee\n\20\f"+
		"\20\16\20\u00f1\13\20\3\20\3\20\3\21\3\21\5\21\u00f7\n\21\3\22\3\22\3"+
		"\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u010a\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u0114\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011d\n"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0127\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0131\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u0137\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0147\n\30\3\30\5\30\u014a\n\30\3\30\3\30\3\30\5\30\u014f"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u015f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u016f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0190\n\32\f\32"+
		"\16\32\u0193\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01a4\n\33\3\34\3\34\3\34\3\34\7\34\u01aa"+
		"\n\34\f\34\16\34\u01ad\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u01b5"+
		"\n\35\f\35\16\35\u01b8\13\35\3\35\3\35\3\36\3\36\5\36\u01be\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u01cb\n \3!\3!\3!\3!\3!"+
		"\5!\u01d2\n!\3!\3!\3\"\3\"\3#\3#\3#\5#\u01db\n#\3$\3$\3%\3%\3%\5%\u01e2"+
		"\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\7(\u01f1\n(\f(\16(\u01f4"+
		"\13(\3(\3(\3(\2\3\62)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLN\2\22\4\2SSWW\4\2QSUW\3\29:\4\2QQTT\3\2\b\t\3"+
		"\2\n\13\3\2\f\r\3\2\16\20\4\2\b\t\21\22\3\2\23\24\4\2\6\6\33%\3\2QR\3"+
		"\2AD\3\2QS\3\2NP\4\2=?LL\u0225\2Q\3\2\2\2\4[\3\2\2\2\6]\3\2\2\2\bn\3\2"+
		"\2\2\nv\3\2\2\2\fx\3\2\2\2\16\u008d\3\2\2\2\20\u009f\3\2\2\2\22\u00a1"+
		"\3\2\2\2\24\u00a5\3\2\2\2\26\u00aa\3\2\2\2\30\u00b6\3\2\2\2\32\u00de\3"+
		"\2\2\2\34\u00e0\3\2\2\2\36\u00e9\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2"+
		"\2$\u0113\3\2\2\2&\u0115\3\2\2\2(\u0130\3\2\2\2*\u0132\3\2\2\2,\u013a"+
		"\3\2\2\2.\u013e\3\2\2\2\60\u0152\3\2\2\2\62\u015e\3\2\2\2\64\u01a3\3\2"+
		"\2\2\66\u01a5\3\2\2\28\u01b0\3\2\2\2:\u01bd\3\2\2\2<\u01bf\3\2\2\2>\u01c6"+
		"\3\2\2\2@\u01cc\3\2\2\2B\u01d5\3\2\2\2D\u01da\3\2\2\2F\u01dc\3\2\2\2H"+
		"\u01e1\3\2\2\2J\u01e3\3\2\2\2L\u01e9\3\2\2\2N\u01eb\3\2\2\2PR\5\4\3\2"+
		"QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\2\2\3V\3\3\2\2"+
		"\2W\\\5\30\r\2X\\\5\36\20\2Y\\\5\"\22\2Z\\\5\6\4\2[W\3\2\2\2[X\3\2\2\2"+
		"[Y\3\2\2\2[Z\3\2\2\2\\\5\3\2\2\2]^\7E\2\2^a\7Q\2\2_`\7\66\2\2`b\7Q\2\2"+
		"a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cg\7\3\2\2df\5\b\5\2ed\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7F\2\2k\7\3\2\2\2lo\5\n\6\2"+
		"mo\5\26\f\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2pw\5\16\b\2qw\5\20\t\2rw\5\22"+
		"\n\2sw\5\24\13\2tw\5\f\7\2uw\5,\27\2vp\3\2\2\2vq\3\2\2\2vr\3\2\2\2vs\3"+
		"\2\2\2vt\3\2\2\2vu\3\2\2\2w\13\3\2\2\2xy\7H\2\2yz\7\65\2\2z{\7Q\2\2{|"+
		"\7\3\2\2|\r\3\2\2\2}~\7H\2\2~\177\7<\2\2\177\u0080\7Q\2\2\u0080\u0081"+
		"\7\4\2\2\u0081\u0084\5L\'\2\u0082\u0083\7\5\2\2\u0083\u0085\5\62\32\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\7\3\2\2\u0087\u008e\3\2\2\2\u0088\u0089\7H\2\2\u0089\u008a\7<\2\2\u008a"+
		"\u008b\7Q\2\2\u008b\u008c\7\5\2\2\u008c\u008e\5\66\34\2\u008d}\3\2\2\2"+
		"\u008d\u0088\3\2\2\2\u008e\17\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7"+
		";\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7\4\2\2\u0093\u0096\5H%\2\u0094\u0095"+
		"\7\5\2\2\u0095\u0097\5\62\32\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u00a0\3\2\2\2\u009a\u009b"+
		"\7H\2\2\u009b\u009c\7;\2\2\u009c\u009d\7Q\2\2\u009d\u009e\7\5\2\2\u009e"+
		"\u00a0\5\66\34\2\u009f\u008f\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\21\3\2"+
		"\2\2\u00a1\u00a2\7H\2\2\u00a2\u00a3\t\2\2\2\u00a3\u00a4\7\3\2\2\u00a4"+
		"\23\3\2\2\2\u00a5\u00a6\7H\2\2\u00a6\u00a7\7M\2\2\u00a7\u00a8\7Q\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\25\3\2\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ad\t\3\2\2"+
		"\u00ac\u00ae\5J&\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b2\7\6\2\2\u00b0\u00b3\5\62\32\2\u00b1\u00b3\5\66\34"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7\3\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7.\2\2\u00b7\u00c1\7Q\2\2\u00b8"+
		"\u00b9\7\66\2\2\u00b9\u00be\7Q\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bd\7Q"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b8\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cc\3\2\2\2\u00c3\u00c4\7I\2\2\u00c4"+
		"\u00c9\7Q\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c8\7Q\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d2\7\3\2\2\u00cf\u00d1\5\32\16\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7/\2\2\u00d6\31\3\2\2\2"+
		"\u00d7\u00df\5$\23\2\u00d8\u00df\5(\25\2\u00d9\u00df\5*\26\2\u00da\u00df"+
		"\5,\27\2\u00db\u00df\5.\30\2\u00dc\u00df\5\34\17\2\u00dd\u00df\5\60\31"+
		"\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da"+
		"\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\33\3\2\2\2\u00e0\u00e1\7K\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00e5\7\6\2\2"+
		"\u00e3\u00e6\5\62\32\2\u00e4\u00e6\5\66\34\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\3\2\2\u00e8\35\3\2\2"+
		"\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7Q\2\2\u00eb\u00ef\7\3\2\2\u00ec\u00ee"+
		"\5 \21\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\61"+
		"\2\2\u00f3\37\3\2\2\2\u00f4\u00f7\5.\30\2\u00f5\u00f7\5&\24\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7!\3\2\2\2\u00f8\u00f9\7\62\2\2\u00f9"+
		"\u00fa\7Q\2\2\u00fa\u00fe\7\3\2\2\u00fb\u00fd\5\60\31\2\u00fc\u00fb\3"+
		"\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\63\2\2\u0102#\3\2\2\2"+
		"\u0103\u0104\7;\2\2\u0104\u0105\7Q\2\2\u0105\u0106\7\4\2\2\u0106\u0109"+
		"\5H%\2\u0107\u0108\7\5\2\2\u0108\u010a\5\62\32\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7\3\2\2\u010c\u0114\3\2"+
		"\2\2\u010d\u010e\7;\2\2\u010e\u0114\7T\2\2\u010f\u0110\7;\2\2\u0110\u0111"+
		"\7Q\2\2\u0111\u0112\7\5\2\2\u0112\u0114\5\66\34\2\u0113\u0103\3\2\2\2"+
		"\u0113\u010d\3\2\2\2\u0113\u010f\3\2\2\2\u0114%\3\2\2\2\u0115\u0116\t"+
		"\4\2\2\u0116\u0117\7;\2\2\u0117\u0118\t\5\2\2\u0118\u0119\7\4\2\2\u0119"+
		"\u011c\5H%\2\u011a\u011b\7\5\2\2\u011b\u011d\5\62\32\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\3\2\2\u011f"+
		"\'\3\2\2\2\u0120\u0121\7<\2\2\u0121\u0122\7Q\2\2\u0122\u0123\7\4\2\2\u0123"+
		"\u0126\5L\'\2\u0124\u0125\7\5\2\2\u0125\u0127\5\62\32\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\3\2\2\u0129"+
		"\u0131\3\2\2\2\u012a\u012b\7<\2\2\u012b\u0131\7T\2\2\u012c\u012d\7<\2"+
		"\2\u012d\u012e\7Q\2\2\u012e\u012f\7\5\2\2\u012f\u0131\5\66\34\2\u0130"+
		"\u0120\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0131)\3\2\2\2"+
		"\u0132\u0133\7\64\2\2\u0133\u0134\7Q\2\2\u0134\u0136\t\5\2\2\u0135\u0137"+
		"\5J&\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\7\3\2\2\u0139+\3\2\2\2\u013a\u013b\7\65\2\2\u013b\u013c\t\5\2\2"+
		"\u013c\u013d\7\3\2\2\u013d-\3\2\2\2\u013e\u0146\7\67\2\2\u013f\u0147\7"+
		"Q\2\2\u0140\u0147\7R\2\2\u0141\u0147\7S\2\2\u0142\u0147\7U\2\2\u0143\u0147"+
		"\7W\2\2\u0144\u0147\7V\2\2\u0145\u0147\5> \2\u0146\u013f\3\2\2\2\u0146"+
		"\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u014a\5J&\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2"+
		"\2\u014b\u014e\7\6\2\2\u014c\u014f\5\62\32\2\u014d\u014f\5\66\34\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\3"+
		"\2\2\u0151/\3\2\2\2\u0152\u0153\78\2\2\u0153\u0154\7S\2\2\u0154\u0155"+
		"\t\6\2\2\u0155\u0156\5\62\32\2\u0156\u0157\7\3\2\2\u0157\61\3\2\2\2\u0158"+
		"\u0159\b\32\1\2\u0159\u015f\5\64\33\2\u015a\u015b\t\7\2\2\u015b\u015f"+
		"\5\62\32\20\u015c\u015d\t\b\2\2\u015d\u015f\5\62\32\17\u015e\u0158\3\2"+
		"\2\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0191\3\2\2\2\u0160"+
		"\u0161\f\16\2\2\u0161\u0162\t\t\2\2\u0162\u0190\5\62\32\17\u0163\u0164"+
		"\f\r\2\2\u0164\u0165\t\7\2\2\u0165\u0190\5\62\32\16\u0166\u016e\f\f\2"+
		"\2\u0167\u0168\7\b\2\2\u0168\u016f\7\b\2\2\u0169\u016a\7\t\2\2\u016a\u016b"+
		"\7\t\2\2\u016b\u016f\7\t\2\2\u016c\u016d\7\t\2\2\u016d\u016f\7\t\2\2\u016e"+
		"\u0167\3\2\2\2\u016e\u0169\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\3\2"+
		"\2\2\u0170\u0190\5\62\32\r\u0171\u0172\f\13\2\2\u0172\u0173\t\n\2\2\u0173"+
		"\u0190\5\62\32\f\u0174\u0175\f\n\2\2\u0175\u0176\t\13\2\2\u0176\u0190"+
		"\5\62\32\13\u0177\u0178\f\t\2\2\u0178\u0179\7\25\2\2\u0179\u0190\5\62"+
		"\32\n\u017a\u017b\f\b\2\2\u017b\u017c\7\26\2\2\u017c\u0190\5\62\32\t\u017d"+
		"\u017e\f\7\2\2\u017e\u017f\7\27\2\2\u017f\u0190\5\62\32\b\u0180\u0181"+
		"\f\6\2\2\u0181\u0182\7\30\2\2\u0182\u0190\5\62\32\7\u0183\u0184\f\5\2"+
		"\2\u0184\u0185\7\31\2\2\u0185\u0190\5\62\32\6\u0186\u0187\f\4\2\2\u0187"+
		"\u0188\7\32\2\2\u0188\u0189\5\62\32\2\u0189\u018a\7\4\2\2\u018a\u018b"+
		"\5\62\32\5\u018b\u0190\3\2\2\2\u018c\u018d\f\3\2\2\u018d\u018e\t\f\2\2"+
		"\u018e\u0190\5\62\32\3\u018f\u0160\3\2\2\2\u018f\u0163\3\2\2\2\u018f\u0166"+
		"\3\2\2\2\u018f\u0171\3\2\2\2\u018f\u0174\3\2\2\2\u018f\u0177\3\2\2\2\u018f"+
		"\u017a\3\2\2\2\u018f\u017d\3\2\2\2\u018f\u0180\3\2\2\2\u018f\u0183\3\2"+
		"\2\2\u018f\u0186\3\2\2\2\u018f\u018c\3\2\2\2\u0190\u0193\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\63\3\2\2\2\u0193\u0191\3\2\2"+
		"\2\u0194\u0195\7&\2\2\u0195\u0196\5\62\32\2\u0196\u0197\7\'\2\2\u0197"+
		"\u01a4\3\2\2\2\u0198\u01a4\7J\2\2\u0199\u01a4\7Q\2\2\u019a\u01a4\7R\2"+
		"\2\u019b\u01a4\7S\2\2\u019c\u01a4\7U\2\2\u019d\u01a4\7W\2\2\u019e\u01a4"+
		"\7V\2\2\u019f\u01a4\5> \2\u01a0\u01a4\5F$\2\u01a1\u01a4\5@!\2\u01a2\u01a4"+
		"\58\35\2\u01a3\u0194\3\2\2\2\u01a3\u0198\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3"+
		"\u019a\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019c\3\2\2\2\u01a3\u019d\3\2"+
		"\2\2\u01a3\u019e\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\65\3\2\2\2\u01a5\u01a6\7(\2\2"+
		"\u01a6\u01ab\5:\36\2\u01a7\u01a8\7\7\2\2\u01a8\u01aa\5:\36\2\u01a9\u01a7"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\7)\2\2\u01af\67\3\2\2\2"+
		"\u01b0\u01b1\7*\2\2\u01b1\u01b6\5:\36\2\u01b2\u01b3\7\7\2\2\u01b3\u01b5"+
		"\5:\36\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7+"+
		"\2\2\u01ba9\3\2\2\2\u01bb\u01be\5\66\34\2\u01bc\u01be\5\62\32\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01be;\3\2\2\2\u01bf\u01c0\7*\2\2\u01c0"+
		"\u01c1\7,\2\2\u01c1\u01c2\7+\2\2\u01c2\u01c3\7*\2\2\u01c3\u01c4\7Q\2\2"+
		"\u01c4\u01c5\7+\2\2\u01c5=\3\2\2\2\u01c6\u01c7\t\r\2\2\u01c7\u01c8\7-"+
		"\2\2\u01c8\u01ca\7Q\2\2\u01c9\u01cb\5<\37\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb?\3\2\2\2\u01cc\u01cd\5B\"\2\u01cd\u01ce\7&\2\2\u01ce"+
		"\u01d1\5D#\2\u01cf\u01d0\7\7\2\2\u01d0\u01d2\5D#\2\u01d1\u01cf\3\2\2\2"+
		"\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7\'\2\2\u01d4A\3"+
		"\2\2\2\u01d5\u01d6\t\16\2\2\u01d6C\3\2\2\2\u01d7\u01d8\t\17\2\2\u01d8"+
		"\u01db\5J&\2\u01d9\u01db\5\62\32\2\u01da\u01d7\3\2\2\2\u01da\u01d9\3\2"+
		"\2\2\u01dbE\3\2\2\2\u01dc\u01dd\t\20\2\2\u01ddG\3\2\2\2\u01de\u01e2\5"+
		"L\'\2\u01df\u01e2\5N(\2\u01e0\u01e2\7Q\2\2\u01e1\u01de\3\2\2\2\u01e1\u01df"+
		"\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2I\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4\u01e5"+
		"\5\62\32\2\u01e5\u01e6\7\4\2\2\u01e6\u01e7\5\62\32\2\u01e7\u01e8\7+\2"+
		"\2\u01e8K\3\2\2\2\u01e9\u01ea\t\21\2\2\u01eaM\3\2\2\2\u01eb\u01ec\7@\2"+
		"\2\u01ec\u01ed\7(\2\2\u01ed\u01f2\7Q\2\2\u01ee\u01ef\7\7\2\2\u01ef\u01f1"+
		"\7Q\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\7)"+
		"\2\2\u01f6O\3\2\2\2.S[agnv\u0084\u008d\u0096\u009f\u00ad\u00b2\u00be\u00c1"+
		"\u00c9\u00cc\u00d2\u00de\u00e5\u00ef\u00f6\u00fe\u0109\u0113\u011c\u0126"+
		"\u0130\u0136\u0146\u0149\u014e\u015e\u016e\u018f\u0191\u01a3\u01ab\u01b6"+
		"\u01bd\u01ca\u01d1\u01da\u01e1\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}