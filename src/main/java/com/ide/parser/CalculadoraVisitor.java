// Generated from Calculadora.g4 by ANTLR 4.7.2
package com.ide.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CalculadoraParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code impresion}
	 * labeled alternative in {@link CalculadoraParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(CalculadoraParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asignacion}
	 * labeled alternative in {@link CalculadoraParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CalculadoraParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vacio}
	 * labeled alternative in {@link CalculadoraParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacio(CalculadoraParser.VacioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesis}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(CalculadoraParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumRes}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumRes(CalculadoraParser.SumResContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalculadoraParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalculadoraParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalculadoraParser.MulDivContext ctx);
}