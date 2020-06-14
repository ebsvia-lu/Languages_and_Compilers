// Generated from M:/IdeaProjects/While-2020/src/uk/ac/essex\progs.g4 by ANTLR 4.8


public class ASTvisitor extends SecondBaseVisitor {

    @Override public String visitStart(assignment2Parser.StartContext ctx) { return "(" + this.visit(ctx.stmt()) + ")";}

    @Override public String visitAssign(assignment2Parser.AssignContext ctx) {  return "(assign " + ctx.VAR().getText() + " " + this.visit(ctx.expr()) + ")"; }

    @Override public String visitIfelse(assignment2Parser.IfelseContext ctx) { return visitChildren(ctx); }

    @Override public String visitWhile(assignment2Parser.WhileContext ctx) {
        String temp = "(while " + this.visit(ctx.boolExp()) + "\n";
        temp += this.visit(ctx.stmt()) ;
        return  temp + ")";
    }

    @Override public String visitPrintExp(assignment2Parser.PrintExpContext ctx) {
        return "(print " + this.visit(ctx.expr())  + ")";
    }

    @Override public String visitPrintBool(assignment2Parser.PrintBoolContext ctx) { return visitChildren(ctx); }


    @Override public String visitNumber(assignment2Parser.NumberContext ctx) { return ctx.figure().getText(); }

    @Override public String visitCompStmt(assignment2Parser.CompStmtContext ctx) {
        String str = "(CompStmt ";
        for (assignment2Parser.StmtContext e : ctx.stmt()) {
            str +=  this.visit(e) + "\n";
        }
        return str + ")";
    }


    @Override
    public String visitVariable(assignment2Parser.VariableContext ctx) {
        return ctx.VAR().getText();
    }

    @Override public String visitNegExp(assignment2Parser.NegExpContext ctx) {return ctx.SUB().getText() + this.visit(ctx.expr()); }

    @Override public String visitMultiplicative(assignment2Parser.MultiplicativeContext ctx) {
        String left = visit(ctx.left);
        String operator = ctx.op.getText();
        String right = visit(ctx.right);
        if (operator.equals("*"))
            return left + " * " + right;
        else if (operator.equals("/"))
            return left + " / " + right;
        else
            return left + "%" + right;
    }

    @Override public String visitAdditive(assignment2Parser.AdditiveContext ctx) {
        String left = visit(ctx.left);
        String operator = ctx.op.getText();
        String right = visit(ctx.right);

        if(operator.equals("+"))
            return "(Add " + left + " " + right + ")";
        else
            return  "(Sub " + left + " " + right + ")";
    }

    @Override public String visitBoolOp(assignment2Parser.BoolOpContext ctx) {
        {
            String left = visit(ctx.left);
            String operator = ctx.op.getText();
            String right = visit(ctx.right);
            if (operator.equals("and"))
                return left + " and " + right;
            else
                return left + " or " + right;
        }
    }

    @Override public String visitTrue(assignment2Parser.TrueContext ctx)  {
        return"True";
    }

    @Override public String visitFalse(assignment2Parser.FalseContext ctx)  {
        return "False";
    }

    @Override public String visitNegBool(assignment2Parser.NegBoolContext ctx)
    {return ctx.NOT().getText() + this.visit(ctx.boolExp());}

    @Override public String visitRelational(assignment2Parser.RelationalContext ctx) {
        String left = visit(ctx.left);
        String operator = ctx.op.getText();
        String right = visit(ctx.right);
        if (operator.equals("<"))
            return left + " < " + right;
        else if (operator.equals("<="))
            return left + " <= " + right;
        else if (operator.equals("=="))
            return left + " == " + right;
        else if (operator.equals(">"))
            return left + " > " + right;
        else
            return left + " >= " + right;
    }

    public String visitInteger(assignment2Parser.IntegerContext ctx)  {
        return ctx.NUM().getText();
    }

    @Override public String visitFloat(assignment2Parser.FloatContext ctx) {
        return ctx.FLOAT().getText(); }

}
