package com.ide.principal;

import com.ide.ide.HelloController;
import com.ide.parser.CalculadoraBaseVisitor;
import com.ide.parser.CalculadoraParser;

import java.util.HashMap;

public class MyVisitor extends CalculadoraBaseVisitor<Integer> {

    HashMap<String, Integer> memoria = new HashMap<String, Integer>();

    @Override public Integer visitAsignacion(CalculadoraParser.AsignacionContext ctx)
    {
        String id = ctx.ID().getText();
        int valor = visit(ctx.expr());
        memoria.put(id, valor);
        return valor;
    }

    @Override public Integer visitInt(CalculadoraParser.IntContext ctx)
    {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override public Integer visitId(CalculadoraParser.IdContext ctx)
    {
        String id = ctx.ID().getText();
        if(memoria.containsKey(id)){
            return memoria.get(id);
        }
        return 0;
    }
    @Override public Integer visitSumRes(CalculadoraParser.SumResContext ctx)
    {
        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        if(ctx.op.getType() == CalculadoraParser.SUM){
            return izq + der;
        }else{
            return izq - der;
        }

    }
    @Override public Integer visitMulDiv(CalculadoraParser.MulDivContext ctx)
    {

        int izq = visit(ctx.expr(0));
        int der = visit(ctx.expr(1));
        if(ctx.op.getType() == CalculadoraParser.MUL){
            return izq * der;
        }else{
            return izq / der;
        }

    }

    @Override public Integer visitParentesis(CalculadoraParser.ParentesisContext ctx)
    {
        return visit(ctx.expr());
    }

    @Override public Integer visitImpresion(CalculadoraParser.ImpresionContext ctx) {
        Integer valor = (int) visit(ctx.expr());
        System.out.println(valor);
        HelloController c = new HelloController();
        c.concatenar(valor.toString());
        return 0;
    }


}
