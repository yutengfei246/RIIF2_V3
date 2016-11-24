// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V3/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RIIF2Parser}.
 */
public interface RIIF2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(RIIF2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(RIIF2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateDecl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDecl(RIIF2Parser.TemplateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateDecl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDecl(RIIF2Parser.TemplateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDecl(RIIF2Parser.AbstractDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDecl(RIIF2Parser.AbstractDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractFailModeDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractFailModeDecl(RIIF2Parser.AbstractFailModeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractFailModeDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractFailModeDecl(RIIF2Parser.AbstractFailModeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractConstanceDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractConstanceDecl(RIIF2Parser.AbstractConstanceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractConstanceDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractConstanceDecl(RIIF2Parser.AbstractConstanceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractParameterDecl(RIIF2Parser.AbstractParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractParameterDecl(RIIF2Parser.AbstractParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractAttributeDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractAttributeDecl(RIIF2Parser.AbstractAttributeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractAttributeDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractAttributeDecl(RIIF2Parser.AbstractAttributeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractPlatformDecl}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPlatformDecl(RIIF2Parser.AbstractPlatformDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractPlatformDecl}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPlatformDecl(RIIF2Parser.AbstractPlatformDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterImposeAssignment(RIIF2Parser.ImposeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitImposeAssignment(RIIF2Parser.ImposeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecl(RIIF2Parser.ComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentDecl}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecl(RIIF2Parser.ComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#setTemplate}.
	 * @param ctx the parse tree
	 */
	void enterSetTemplate(RIIF2Parser.SetTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#setTemplate}.
	 * @param ctx the parse tree
	 */
	void exitSetTemplate(RIIF2Parser.SetTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDecl(RIIF2Parser.EnvironmentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDecl(RIIF2Parser.EnvironmentDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentBodyElements}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentBodyElements(RIIF2Parser.EnvironmentBodyElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentBodyElements}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentBodyElements(RIIF2Parser.EnvironmentBodyElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#requirementDecl}.
	 * @param ctx the parse tree
	 */
	void enterRequirementDecl(RIIF2Parser.RequirementDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#requirementDecl}.
	 * @param ctx the parse tree
	 */
	void exitRequirementDecl(RIIF2Parser.RequirementDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(RIIF2Parser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(RIIF2Parser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#envParameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterEnvParameterDecl(RIIF2Parser.EnvParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#envParameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitEnvParameterDecl(RIIF2Parser.EnvParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#constanceDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstanceDecl(RIIF2Parser.ConstanceDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#constanceDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstanceDecl(RIIF2Parser.ConstanceDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDecl}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDecl(RIIF2Parser.ChildComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDecl}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDecl(RIIF2Parser.ChildComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDecl}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDecl(RIIF2Parser.FailModeDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDecl}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDecl(RIIF2Parser.FailModeDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listConstructor}.
	 * @param ctx the parse tree
	 */
	void enterListConstructor(RIIF2Parser.ListConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listConstructor}.
	 * @param ctx the parse tree
	 */
	void exitListConstructor(RIIF2Parser.ListConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructor(RIIF2Parser.ArrayConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#arrayConstructor}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructor(RIIF2Parser.ArrayConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#constructorType}.
	 * @param ctx the parse tree
	 */
	void enterConstructorType(RIIF2Parser.ConstructorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#constructorType}.
	 * @param ctx the parse tree
	 */
	void exitConstructorType(RIIF2Parser.ConstructorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#tableColumns}.
	 * @param ctx the parse tree
	 */
	void enterTableColumns(RIIF2Parser.TableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#tableColumns}.
	 * @param ctx the parse tree
	 */
	void exitTableColumns(RIIF2Parser.TableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#attrIdent}.
	 * @param ctx the parse tree
	 */
	void enterAttrIdent(RIIF2Parser.AttrIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#attrIdent}.
	 * @param ctx the parse tree
	 */
	void exitAttrIdent(RIIF2Parser.AttrIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(RIIF2Parser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(RIIF2Parser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(RIIF2Parser.EnumTypeContext ctx);
}