public class SecondBaseVisitor extends assignment2BaseVisitor<String> {
    private int indent = 0;

    //Indent - important for python syntax
    private String empties (int n){
        String ans = "";
        for (int i = 1;i <= n; i++){
            ans = ans + " ";
        }        
        return ans;
    }

    @Override
    //start of the grammar
    public String visitStart(assignment2Parser.StartContext ctx) {
        return   this.visit(ctx.stmt()) ;
    }

    @Override
    public String visitSkip(assignment2Parser.SkipContext ctx) { return "pass"; }

    @Override
    //print expression
    public String visitPrintExp(assignment2Parser.PrintExpContext ctx) {
        return "print(" + this.visit(ctx.expr()) + ')';
    }

    @Override
    //print bollean, true or false
    public String visitPrintBool(assignment2Parser.PrintBoolContext ctx) {
        return "print(" + this.visit(ctx.boolExp()) + ')';
    }

    @Override
    //while loop followed with a boolean expresion and statement (indents are also included)
    public String visitWhile(assignment2Parser.WhileContext ctx) {
        String ans = "while " + this.visit(ctx.boolExp()) + ":\n";
        indent += 5;
        ans += this.visit(ctx.stmt()) + "\n";
        indent -= 5;
        return ans;
    }

    @Override //statement sequence
     public String visitCompStmt(assignment2Parser.CompStmtContext ctx) {
        String t = "";

        for (assignment2Parser.StmtContext e: ctx.stmt())
            t += empties(indent) + this.visit(e) + "\n";
        return t;
    }


    @Override
    //assigning variables - get the text and the expression
    public String visitAssign(assignment2Parser.AssignContext ctx) {
        return ctx.VAR().getText() + " = " + this.visit(ctx.expr());
    }

    @Override
    //if - else statement followed with a boolean expresion and statement (indents are also included)
    public String visitIfelse(assignment2Parser.IfelseContext ctx) {
        String ans = "if " + this.visit(ctx.boolExp()) + ":\n";
        indent +=  5;
        ans += this.visit(ctx.stmt(0));
        indent -=  5;
        ans += empties(indent);
        indent +=  5;
        ans += this.visit(ctx.stmt(1));
        indent -=  5;
        return ans ;
    }
 //get number
    @Override
    public String visitNumber(assignment2Parser.NumberContext ctx) {
        return ctx.figure().getText();
    }
    //get variable
    @Override
    public String visitVariable(assignment2Parser.VariableContext ctx) {
        return ctx.VAR().getText();
    }

    //negative expression (SUB == - )
    @Override
    public String visitNegExp(assignment2Parser.NegExpContext ctx) {
        return ctx.SUB().getText() + this.visit(ctx.expr());
    }
    //multiplication and division
    @Override
    public String visitMultiplicative(assignment2Parser.MultiplicativeContext ctx) {
        String left = visit(ctx.left);
        String op = ctx.op.getText();
        String right = visit(ctx.right);
        if (op.equals("*"))
            return left + " * " + right;
        else if (op.equals("/"))
            return left + " / " + right;
        else
            return left + "%" + right;
    }

    @Override
    //addition and subtraction
    public String visitAdditive(assignment2Parser.AdditiveContext ctx) {
        String left = visit(ctx.left);
        String op = ctx.op.getText();
        String right = visit(ctx.right);
        if (op.equals("+"))
            return left + " + " + right;
        else
            return left + " - " + right;
    }



    @Override public String visitBrackets(assignment2Parser.BracketsContext ctx) {
        return "("+ this.visit(ctx.expr()) + ")";
    }

//boolean operation

    @Override
    public String visitBoolOp(assignment2Parser.BoolOpContext ctx) {
        String left = visit(ctx.left);
        String op = ctx.op.getText();
        String right = visit(ctx.right);
        if (op.equals("and"))
            return left + " and " + right;
        else
            return left + " or " + right;
    }

    @Override
    public String visitTrue(assignment2Parser.TrueContext ctx) {
        return"True";
    }

    @Override
    public String visitFalse(assignment2Parser.FalseContext ctx) {
        return "False";
    }

    @Override
    public String visitNegBool(assignment2Parser.NegBoolContext ctx) {
        return ctx.NOT().getText() + this.visit(ctx.boolExp());
    }
//Greater than, Greater or equal too, Less than, Less than or equal too
    @Override
    public String visitRelational(assignment2Parser.RelationalContext ctx) {
        String left = visit(ctx.left);
        String op = ctx.op.getText();
        String right = visit(ctx.right);
        if (op.equals("<"))
            return left + " < " + right;
        else if (op.equals("<="))
            return left + " <= " + right;
        else if (op.equals("=="))
            return left + " == " + right;
        else if (op.equals(">"))
            return left + " > " + right;
        else
            return left + " >= " + right;
    }
//Allow declaration of floats and integers
    @Override
    public String visitInteger(assignment2Parser.IntegerContext ctx)  {
        return ctx.NUM().getText();
    }

    @Override public String visitFloat(assignment2Parser.FloatContext ctx) {
        return ctx.FLOAT().getText(); }


}







