package esjc.ast;

import java.util.HashMap;
import java.util.List;

import esjc.parser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.eclipse.jdt.core.dom.*;

/**
 * This class builds JDT AST from ANTLR Parse Tree produced by
 * ExtendedStaticJava parser.
 *
 * @author <a href="mailto:robby@cis.ksu.edu">Robby</a>
 */
public class ExtendedStaticJavaASTBuilder extends
        ExtendedStaticJavaBaseVisitor<ASTNode> {

  static CompilationUnit ast(final ExtendedStaticJavaParser.CompilationUnitContext ctx) {
    final ExtendedStaticJavaASTBuilder builder = new ExtendedStaticJavaASTBuilder();
    return builder.build(ctx);
  }

  final static HashMap<String, InfixExpression.Operator> binopMap;

  final static HashMap<String, PrefixExpression.Operator> unopMap;

  static {
    binopMap = new HashMap<>(16);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "||",
            InfixExpression.Operator.CONDITIONAL_OR);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "&&",
            InfixExpression.Operator.CONDITIONAL_AND);
    ExtendedStaticJavaASTBuilder.binopMap.put("==", InfixExpression.Operator.EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap
            .put("!=", InfixExpression.Operator.NOT_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put("<", InfixExpression.Operator.LESS);
    ExtendedStaticJavaASTBuilder.binopMap.put(">", InfixExpression.Operator.GREATER);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            "<=",
            InfixExpression.Operator.LESS_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put(
            ">=",
            InfixExpression.Operator.GREATER_EQUALS);
    ExtendedStaticJavaASTBuilder.binopMap.put("+", InfixExpression.Operator.PLUS);
    ExtendedStaticJavaASTBuilder.binopMap.put("-", InfixExpression.Operator.MINUS);
    ExtendedStaticJavaASTBuilder.binopMap.put("*", InfixExpression.Operator.TIMES);
    ExtendedStaticJavaASTBuilder.binopMap.put("/", InfixExpression.Operator.DIVIDE);
    ExtendedStaticJavaASTBuilder.binopMap.put("%", InfixExpression.Operator.REMAINDER);
    ExtendedStaticJavaASTBuilder.binopMap.put(">>>", InfixExpression.Operator.RIGHT_SHIFT_UNSIGNED);

    unopMap = new HashMap<>(4);
    ExtendedStaticJavaASTBuilder.unopMap.put("+", PrefixExpression.Operator.PLUS);
    ExtendedStaticJavaASTBuilder.unopMap.put("-", PrefixExpression.Operator.MINUS);
    ExtendedStaticJavaASTBuilder.unopMap.put("!", PrefixExpression.Operator.NOT);
    ExtendedStaticJavaASTBuilder.unopMap.put("~", PrefixExpression.Operator.COMPLEMENT);
  }

  protected AST ast = AST.newAST(AST.JLS10);

  private ExtendedStaticJavaASTBuilder() {
  }

  @SuppressWarnings("unchecked")
  private void add(@SuppressWarnings("rawtypes") final List l, final Object o) {
    l.add(o);
  }

  @SuppressWarnings("unchecked")
  private <T extends ASTNode> T build(final ParserRuleContext tree) {
    return (T) visit(tree);
  }

  private <E extends ParserRuleContext> void builds(
      @SuppressWarnings("rawtypes") final List l, final List<E> trees) {
    if (trees != null) {
      for (final E e : trees) {
        add(l, build(e));
      }
    }
  }

  @Override
  public ExpressionStatement visitAssignStatement(
          final ExtendedStaticJavaParser.AssignStatementContext ctx) {
    final Assignment a = this.ast.newAssignment();
    final ExpressionStatement result = this.ast.newExpressionStatement(a);

    a.setLeftHandSide(this.ast.newSimpleName(ctx.assign().lhs().getText()));
//    a.setLeftHandSide(this.build(ctx.assign().lhs()));
    a.setRightHandSide(this.build(ctx.assign().exp()));

    return result;
  }

  @Override
  public InfixExpression visitBinaryExp(final ExtendedStaticJavaParser.BinaryExpContext ctx) {
    final InfixExpression result = this.ast.newInfixExpression();

    result.setLeftOperand(this.build(ctx.e1));

    result.setOperator(ExtendedStaticJavaASTBuilder.binopMap.get(ctx.op.getText()));

    result.setRightOperand(this.build(ctx.e2));

    return result;
  }

  @Override
  public PrimitiveType visitBooleanType(final ExtendedStaticJavaParser.BooleanTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.BOOLEAN);
  }

  @Override
  public ArrayType visitArrayType(ExtendedStaticJavaParser.ArrayTypeContext ctx) {
    return this.ast.newArrayType(this.build(ctx.type()));
  }

  @Override
  public TypeDeclaration visitClassDefinition(final ExtendedStaticJavaParser.ClassDefinitionContext ctx) {
    final TypeDeclaration result = this.ast.newTypeDeclaration();
    add(
            result.modifiers(),
            this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    add(
            result.bodyDeclarations(),
            this.<MethodDeclaration> build(ctx.mainMethodDeclaration()));

    final List<ExtendedStaticJavaParser.MemberDeclarationContext> memberDeclarations = ctx
            .memberDeclaration();
    if (memberDeclarations != null) {
      builds(result.bodyDeclarations(), memberDeclarations);
    }

    return result;
  }

  @Override
  public CompilationUnit visitCompilationUnit(final ExtendedStaticJavaParser.CompilationUnitContext ctx) {
    final CompilationUnit result = this.ast.newCompilationUnit();

    add(result.types(), this.<TypeDeclaration> build(ctx.classDefinition()));

    return result;
  }

  @Override
  public BooleanLiteral visitFalseLiteral(final ExtendedStaticJavaParser.FalseLiteralContext ctx) {
    return this.ast.newBooleanLiteral(false);
  }

  @Override
  public FieldDeclaration visitFieldDeclaration(
          final ExtendedStaticJavaParser.FieldDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
            .newVariableDeclarationFragment();
    final FieldDeclaration result = this.ast.newFieldDeclaration(vdf);
    add(
            result.modifiers(),
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public SimpleName visitIdExp(final ExtendedStaticJavaParser.IdExpContext ctx) {
    return this.ast.newSimpleName(ctx.ID().getText());
  }

  @Override
  public IfStatement visitIfStatement(final ExtendedStaticJavaParser.IfStatementContext ctx) {
    final IfStatement result = this.ast.newIfStatement();
    final Block thenBlock = this.ast.newBlock();
    result.setThenStatement(thenBlock);
    final Block elseBlock = this.ast.newBlock();
    result.setElseStatement(elseBlock);

    result.setExpression(this.build(ctx.exp()));

    final List<ExtendedStaticJavaParser.StatementContext> ts = ctx.ts;
    if (ts != null) {
      builds(thenBlock.statements(), ts);
    }

    final List<ExtendedStaticJavaParser.StatementContext> fs = ctx.fs;
    if (fs != null) {
      builds(elseBlock.statements(), fs);
    }

    return result;
  }

  @Override
  public NumberLiteral visitIntLiteral(final ExtendedStaticJavaParser.IntLiteralContext ctx) {
    final NumberLiteral result = this.ast.newNumberLiteral();
    result.setToken(ctx.getText());
    return result;
  }

  @Override
  public PrimitiveType visitIntType(final ExtendedStaticJavaParser.IntTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.INT);
  }

  @Override
  public QualifiedName visitFieldAccessExp(ExtendedStaticJavaParser.FieldAccessExpContext ctx) {
    return this.ast.newQualifiedName(this.build(ctx), this.ast.newSimpleName(ctx.id.getText()));
  }

  @Override
  public ArrayAccess visitArrayAccessExp(ExtendedStaticJavaParser.ArrayAccessExpContext ctx) {
    final ArrayAccess aac = this.ast.newArrayAccess();

    aac.setArray(this.build(ctx.id));
    aac.setIndex(this.build(ctx.inner));

    return aac;
  }


  @Override
  public ArrayCreation visitArrayCreationExp(ExtendedStaticJavaParser.ArrayCreationExpContext ctx) {
    final ArrayCreation arr = this.ast.newArrayCreation();
    arr.setType(this.build(ctx.typeid));
    final ArrayInitializer init = this.ast.newArrayInitializer();
    arr.setInitializer(init);

    if (ctx.initexpr.exp() != null){
      builds(init.expressions(), ctx.initexpr.exp());
    }

    return arr;
  }

  @Override
  public ConditionalExpression visitCondExp(ExtendedStaticJavaParser.CondExpContext ctx) {
    final ConditionalExpression expr = this.ast.newConditionalExpression();
    expr.setExpression(this.build(ctx.condition));
    expr.setThenExpression(this.build(ctx.p1));
    expr.setElseExpression(this.build(ctx.p2));

    return expr;
  }

  @Override
  public DoStatement visitDoWhileStatement(ExtendedStaticJavaParser.DoWhileStatementContext ctx) {
    final DoStatement statement = this.ast.newDoStatement();
    final Block codeblock = this.ast.newBlock();

    statement.setExpression(this.build(ctx.exp()));
    statement.setBody(codeblock);

    final List<ExtendedStaticJavaParser.StatementContext> statements = ctx.contents;
    if (statements != null) {
      builds(codeblock.statements(), statements);
    }

    return statement;
  }

  @Override
  public MethodInvocation visitInvoke(final ExtendedStaticJavaParser.InvokeContext ctx) {
    final MethodInvocation result = this.ast.newMethodInvocation();

    if (ctx.id1 != null) {
      result.setExpression(this.ast.newSimpleName(ctx.id1.getText()));
    }

    result.setName(this.ast.newSimpleName(ctx.id2.getText()));

    final ExtendedStaticJavaParser.ArgsContext args = ctx.args();
    if (args != null) {
      builds(result.arguments(), args.exp());
    }

    return result;
  }

  @Override
  public MethodInvocation visitInvokeExp(final ExtendedStaticJavaParser.InvokeExpContext ctx) {
    return this.build(ctx.invoke());
  }

  @Override
  public ExpressionStatement visitInvokeExpStatement(
          final ExtendedStaticJavaParser.InvokeExpStatementContext ctx) {
    return this.ast.newExpressionStatement(this.<MethodInvocation> build(ctx
            .invoke()));
  }

  @Override
  public VariableDeclarationStatement visitLocalDeclaration(
          final ExtendedStaticJavaParser.LocalDeclarationContext ctx) {
    final VariableDeclarationFragment vdf = this.ast
            .newVariableDeclarationFragment();
    final VariableDeclarationStatement result = this.ast
            .newVariableDeclarationStatement(vdf);

    result.setType(this.build(ctx.type()));

    vdf.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override public ClassInstanceCreation visitNewExp(ExtendedStaticJavaParser.NewExpContext ctx) {
    final ClassInstanceCreation rval = this.ast.newClassInstanceCreation();
    rval.setType(this.ast.newSimpleType(this.ast.newSimpleName(ctx.name.getText())));
    return rval;
  }

  @Override
  public MethodDeclaration visitMainMethodDeclaration(
          final ExtendedStaticJavaParser.MainMethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
            result.modifiers(),
            this.ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
    add(
            result.modifiers(),
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
    result.setReturnType2(this.ast.newPrimitiveType(PrimitiveType.VOID));
    result.setName(this.ast.newSimpleName("main"));

    final SingleVariableDeclaration svd = this.ast
            .newSingleVariableDeclaration();
    svd.setType(this.ast.newArrayType(this.ast.newSimpleType(this.ast
            .newSimpleName("String"))));
    svd.setName(this.ast.newSimpleName(ctx.id3.getText()));
    add(result.parameters(), svd);

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Block visitMethodBody(final ExtendedStaticJavaParser.MethodBodyContext ctx) {
    final Block result = this.ast.newBlock();

    final List<ExtendedStaticJavaParser.LocalDeclarationContext> localDeclarations = ctx
            .localDeclaration();
    if (localDeclarations != null) {
      builds(result.statements(), localDeclarations);
    }

    final List<ExtendedStaticJavaParser.StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(result.statements(), statements);
    }

    return result;
  }

  @Override
  public MethodDeclaration visitMethodDeclaration(
          final ExtendedStaticJavaParser.MethodDeclarationContext ctx) {
    final MethodDeclaration result = this.ast.newMethodDeclaration();
    add(
            result.modifiers(),
            this.ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));

    result.setReturnType2(this.build(ctx.returnType()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    final ExtendedStaticJavaParser.ParamsContext params = ctx.params();
    if (params != null) {
      builds(result.parameters(), params.param());
    }

    result.setBody(this.build(ctx.methodBody()));

    return result;
  }

  @Override
  public Type visitNonVoidReturnType(final ExtendedStaticJavaParser.NonVoidReturnTypeContext ctx) {
    return this.build(ctx.type());
  }

  @Override
  public NullLiteral visitNullLiteral(final ExtendedStaticJavaParser.NullLiteralContext ctx) {
    return this.ast.newNullLiteral();
  }

  @Override
  public SingleVariableDeclaration visitParam(final ExtendedStaticJavaParser.ParamContext ctx) {
    final SingleVariableDeclaration result = this.ast
            .newSingleVariableDeclaration();

    result.setType(this.build(ctx.type()));

    result.setName(this.ast.newSimpleName(ctx.ID().getText()));

    return result;
  }

  @Override
  public ParenthesizedExpression visitParenExp(final ExtendedStaticJavaParser.ParenExpContext ctx) {
    final ParenthesizedExpression result = this.ast
            .newParenthesizedExpression();

    result.setExpression(this.build(ctx.exp()));

    return result;
  }

  @Override
  public ReturnStatement visitReturnStatement(final ExtendedStaticJavaParser.ReturnStatementContext ctx) {
    final ReturnStatement result = this.ast.newReturnStatement();

    final ExtendedStaticJavaParser.ExpContext exp = ctx.exp();
    if (exp != null) {
      result.setExpression(this.build(exp));
    }

    return result;
  }

  @Override
  public BooleanLiteral visitTrueLiteral(final ExtendedStaticJavaParser.TrueLiteralContext ctx) {
    return this.ast.newBooleanLiteral(true);
  }

  @Override
  public PrefixExpression visitUnaryExp(final ExtendedStaticJavaParser.UnaryExpContext ctx) {
    final PrefixExpression result = this.ast.newPrefixExpression();

    result.setOperator(ExtendedStaticJavaASTBuilder.unopMap.get(ctx.op.getText()));

    result.setOperand(this.build(ctx.exp()));

    return result;
  }

  @Override
  public PrimitiveType visitVoidType(final ExtendedStaticJavaParser.VoidTypeContext ctx) {
    return this.ast.newPrimitiveType(PrimitiveType.VOID);
  }

  @Override
  public WhileStatement visitWhileStatement(final ExtendedStaticJavaParser.WhileStatementContext ctx) {
    final WhileStatement result = this.ast.newWhileStatement();
    final Block whileBody = this.ast.newBlock();
    result.setBody(whileBody);

    result.setExpression(this.build(ctx.exp()));

    final List<ExtendedStaticJavaParser.StatementContext> statements = ctx.statement();
    if (statements != null) {
      builds(whileBody.statements(), statements);
    }

    return result;
  }

}
