// Generated from Traductor.g4 by ANTLR 4.7.2
package com.ide.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraductorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraductorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraductorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TraductorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link TraductorParser#encabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(TraductorParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(TraductorParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(TraductorParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifGod}
	 * labeled alternative in {@link TraductorParser#if_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGod(TraductorParser.IfGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseGod}
	 * labeled alternative in {@link TraductorParser#else_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseGod(TraductorParser.ElseGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseifgod}
	 * labeled alternative in {@link TraductorParser#elseIf_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifgod(TraductorParser.ElseifgodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileGod}
	 * labeled alternative in {@link TraductorParser#while_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileGod(TraductorParser.WhileGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarasigod}
	 * labeled alternative in {@link TraductorParser#declarasignar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarasigod(TraductorParser.DeclarasigodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaragod}
	 * labeled alternative in {@link TraductorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaragod(TraductorParser.DeclaragodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impregod}
	 * labeled alternative in {@link TraductorParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpregod(TraductorParser.ImpregodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignagod}
	 * labeled alternative in {@link TraductorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignagod(TraductorParser.AsignagodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relacional}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(TraductorParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionParentesis}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionParentesis(TraductorParser.CondicionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueGod}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueGod(TraductorParser.TrueGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionN}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionN(TraductorParser.CondicionNContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdad}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdad(TraductorParser.IgualdadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(TraductorParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseGod}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseGod(TraductorParser.FalseGodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link TraductorParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(TraductorParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intneg}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntneg(TraductorParser.IntnegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(TraductorParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(TraductorParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TraductorParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(TraductorParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link TraductorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(TraductorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(TraductorParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraductorParser#declaracionesElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionesElse(TraductorParser.DeclaracionesElseContext ctx);
}