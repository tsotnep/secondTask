// Generated from E:/Workspace/iag0450-antlr/secondTask/src\language.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link languageParser}.
 */
public interface languageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(languageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(languageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link languageParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(languageParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link languageParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(languageParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign(languageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign(languageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(languageParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link languageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(languageParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(languageParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(languageParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(languageParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(languageParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(languageParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link languageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(languageParser.IntContext ctx);
}