// Generated from E:/Workspace/iag0450-antlr/secondTask/src\language.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link languageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface languageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link languageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(languageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link languageParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(languageParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(languageParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(languageParser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(languageParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(languageParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(languageParser.IntContext ctx);
}