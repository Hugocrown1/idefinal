// Generated from Travis.g4 by ANTLR 4.7.2
package com.ide.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TravisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TravisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TravisParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TravisParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link TravisParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(TravisParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TravisParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(TravisParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TravisParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(TravisParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifGod}
	 * labeled alternative in {@link TravisParser#if_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGod(TravisParser.IfGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseGod}
	 * labeled alternative in {@link TravisParser#else_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseGod(TravisParser.ElseGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifgod}
	 * labeled alternative in {@link TravisParser#elseIf_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifgod(TravisParser.ElseifgodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileGod}
	 * labeled alternative in {@link TravisParser#while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileGod(TravisParser.WhileGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarasigod}
	 * labeled alternative in {@link TravisParser#declarasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarasigod(TravisParser.DeclarasigodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaragod}
	 * labeled alternative in {@link TravisParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaragod(TravisParser.DeclaragodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impregod}
	 * labeled alternative in {@link TravisParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpregod(TravisParser.ImpregodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignagod}
	 * labeled alternative in {@link TravisParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignagod(TravisParser.AsignagodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacional}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(TravisParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionParentesis}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionParentesis(TravisParser.CondicionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueGod}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueGod(TravisParser.TrueGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionN}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionN(TravisParser.CondicionNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdad}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(TravisParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(TravisParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseGod}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseGod(TravisParser.FalseGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TravisParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(TravisParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intneg}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntneg(TravisParser.IntnegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(TravisParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(TravisParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TravisParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TravisParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TravisParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TravisParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TravisParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(TravisParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TravisParser#declaracionesElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesElse(TravisParser.DeclaracionesElseContext ctx);
}