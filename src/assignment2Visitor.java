// Generated from /Users/ebeetiobhio/Downloads/Languages and Compilers/src/assignment2.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link assignment2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface assignment2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link assignment2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(assignment2Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(assignment2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(assignment2Parser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifelse}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(assignment2Parser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(assignment2Parser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExp}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExp(assignment2Parser.PrintExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printBool}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintBool(assignment2Parser.PrintBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompStmt}
	 * labeled alternative in {@link assignment2Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompStmt(assignment2Parser.CompStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(assignment2Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(assignment2Parser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(assignment2Parser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicative}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(assignment2Parser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(assignment2Parser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additive}
	 * labeled alternative in {@link assignment2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(assignment2Parser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolOp}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(assignment2Parser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(assignment2Parser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(assignment2Parser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negBool}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegBool(assignment2Parser.NegBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link assignment2Parser#boolExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(assignment2Parser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(assignment2Parser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link assignment2Parser#figure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(assignment2Parser.IntegerContext ctx);
}