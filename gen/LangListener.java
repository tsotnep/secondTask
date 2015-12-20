// Generated from /home/tsotne/git/iag0450-antlr-1/secondTask/src/Lang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(LangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(LangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(LangParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(LangParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createWithValue}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateWithValue(LangParser.CreateWithValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createWithValue}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateWithValue(LangParser.CreateWithValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createArray}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateArray(LangParser.CreateArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createArray}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateArray(LangParser.CreateArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assVarVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssVarVal(LangParser.AssVarValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assVarVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssVarVal(LangParser.AssVarValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assVarVar}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssVarVar(LangParser.AssVarVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assVarVar}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssVarVar(LangParser.AssVarVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assValVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssValVal(LangParser.AssValValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assValVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssValVal(LangParser.AssValValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addToArrayElement}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAddToArrayElement(LangParser.AddToArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addToArrayElement}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAddToArrayElement(LangParser.AddToArrayElementContext ctx);
}