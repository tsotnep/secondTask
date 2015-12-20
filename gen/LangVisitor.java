// Generated from /home/tsotne/git/iag0450-antlr-1/secondTask/src/Lang.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(LangParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exitStmt}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStmt(LangParser.ExitStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createWithValue}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateWithValue(LangParser.CreateWithValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createArray}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateArray(LangParser.CreateArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assVarVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssVarVal(LangParser.AssVarValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assVarVar}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssVarVar(LangParser.AssVarVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assValVal}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssValVal(LangParser.AssValValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addToArrayElement}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToArrayElement(LangParser.AddToArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addToVarTheArray}
	 * labeled alternative in {@link LangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddToVarTheArray(LangParser.AddToVarTheArrayContext ctx);
}