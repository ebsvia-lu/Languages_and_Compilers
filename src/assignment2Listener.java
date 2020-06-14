// Generated from /Users/ebeetiobhio/Downloads/Languages and Compilers/src/assignment2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link assignment2Parser}.
 */
public interface assignment2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link assignment2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(assignment2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link assignment2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(assignment2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(assignment2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(assignment2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip(assignment2Parser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip(assignment2Parser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(assignment2Parser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(assignment2Parser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(assignment2Parser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(assignment2Parser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExp}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintExp(assignment2Parser.PrintExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExp}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintExp(assignment2Parser.PrintExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintBool(assignment2Parser.PrintBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintBool(assignment2Parser.PrintBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompStmt(assignment2Parser.CompStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompStmt(assignment2Parser.CompStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(assignment2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(assignment2Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(assignment2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(assignment2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(assignment2Parser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(assignment2Parser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(assignment2Parser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(assignment2Parser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(assignment2Parser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(assignment2Parser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additive}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(assignment2Parser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additive}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(assignment2Parser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(assignment2Parser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(assignment2Parser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterTrue(assignment2Parser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitTrue(assignment2Parser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterFalse(assignment2Parser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitFalse(assignment2Parser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negBool}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterNegBool(assignment2Parser.NegBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negBool}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitNegBool(assignment2Parser.NegBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterRelational(assignment2Parser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitRelational(assignment2Parser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 */
	void enterFloat(assignment2Parser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 */
	void exitFloat(assignment2Parser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 */
	void enterInteger(assignment2Parser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 */
	void exitInteger(assignment2Parser.IntegerContext ctx);
}