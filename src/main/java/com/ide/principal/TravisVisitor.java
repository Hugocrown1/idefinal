package com.ide.principal;

import com.ide.ide.HelloController;
import com.ide.parser.TravisBaseVisitor;
import com.ide.parser.TravisParser;

public class TravisVisitor extends TravisBaseVisitor {


    Scope memoria = new Scope();





    @Override public Integer visitDeclaragod(TravisParser.DeclaragodContext ctx){
        memoria.declarar(ctx.ID().getText());
        return null;
    }

    @Override public Integer visitDeclarasigod(TravisParser.DeclarasigodContext ctx) {
        memoria.declarar(ctx.ID().getText());
        memoria.asignar(ctx.ID().getText(),(int)visit(ctx.expr()));
        return null;

    }

    @Override public Integer visitAsignagod(TravisParser.AsignagodContext ctx)
    {
        memoria.asignar(ctx.ID().getText(),(int) visit(ctx.expr()));
        return null;
    }

    @Override public Integer visitIfGod(TravisParser.IfGodContext ctx) {
        memoria = new Scope(memoria);
        boolean condicion = (boolean) visit(ctx.condicion());
        if (condicion) {
            visit(ctx.declaraciones());
            memoria = memoria.parent();
            return null;
        } else if (ctx.elseIf_state() != null) {
            for (TravisParser.ElseIf_stateContext elseif: ctx.elseIf_state()) {
                boolean cond = (boolean)visit(elseif);
                if(cond) {
                    memoria = memoria.parent();
                    return null;
                }
            }
        } if (ctx.else_state() != null) {
            visit(ctx.else_state());
        }
        memoria = memoria.parent();
        return null;
    }

    @Override public Integer visitElseGod(TravisParser.ElseGodContext ctx) {
            visit(ctx.declaracionesElse());
        return null;
    }

    @Override public Boolean visitElseifgod(TravisParser.ElseifgodContext ctx) {
        boolean condicion = (boolean) this.visit(ctx.condicion());
        if(condicion){
            this.visit(ctx.declaraciones());
            return true;

        }else {
            return false;
        }
    }

    @Override public Boolean visitWhileGod(TravisParser.WhileGodContext ctx) {

        while((boolean)this.visit(ctx.condicion())){
            memoria = new Scope(memoria);
            this.visit(ctx.declaraciones());
            this.visit(ctx.condicion());
            memoria = memoria.parent();
        }
        return null;
    }



    @Override public Boolean visitRelacional(TravisParser.RelacionalContext ctx) {
        int izq = (int) this.visit(ctx.expr(0));
        int der = (int) this.visit(ctx.expr(1));

        if (ctx.op.getType() == TravisParser.GT) {
            return izq > der;
        }
        if (ctx.op.getType()==TravisParser.LT) {

            return izq < der;

        }
        if (ctx.op.getType()==TravisParser.GTEQ) {

            return izq >= der;

        }

        if (ctx.op.getType()==TravisParser.LTEQ) {

            return izq <= der;

        }
        return null;
    }

    @Override public Boolean visitOrExpr(TravisParser.OrExprContext ctx) {
        boolean izq = (boolean) this.visit(ctx.condicion(0));
        boolean der = (boolean) this.visit(ctx.condicion(1));

        return (izq || der);

    }
    @Override public Boolean visitAndExpr(TravisParser.AndExprContext ctx) {
        boolean izq = (boolean) this.visit(ctx.condicion(0));
        boolean der = (boolean) this.visit(ctx.condicion(1));
        return (izq && der);

    }

    @Override public Boolean visitIgualdad(TravisParser.IgualdadContext ctx) {
        int izq = (int) this.visit(ctx.expr(0));
        int der = (int) this.visit(ctx.expr(1));
        if(ctx.op.getType() == TravisParser.IG){
            return izq==der;

        }else{
            return izq!=der;
        }

    }
    @Override public Boolean visitTrueGod(TravisParser.TrueGodContext ctx) {
        return true; }

    @Override public Boolean visitFalseGod(TravisParser.FalseGodContext ctx) {
        return false;
    }

    @Override public Integer visitInt(TravisParser.IntContext ctx){return Integer.valueOf(ctx.NUMERO().getText());}
    @Override public Integer visitIntneg(TravisParser.IntnegContext ctx) {return Integer.valueOf(ctx.NUMERO().getText()); }


    @Override public Integer visitId(TravisParser.IdContext ctx)
    {
            return memoria.regresar(ctx.ID().getText());

    }
    //visitsResSum
    @Override public Integer visitSumRes(TravisParser.SumResContext ctx)
    {
        int izq = (int)visit(ctx.expr(0));
        int der = (int)visit(ctx.expr(1));
        if(ctx.op.getType() == TravisParser.SUM){
            return (izq) + (der);
        }else{
            return (izq) - (der);
        }

    }
    @Override public Integer visitMulDiv(TravisParser.MulDivContext ctx)
    {

        int izq = (int)visit(ctx.expr(0));
        int der = (int)visit(ctx.expr(1));
        if(ctx.op.getType() == TravisParser.MUL) {
            return izq * der;
        } else {
            try{
                return izq / der;
            }catch (ArithmeticException e){
                HelloController controller = new HelloController();
                controller.concatenar("No se puede dividir entre 0");
            }
        }
        return null;

    }

    @Override public Integer visitParentesis(TravisParser.ParentesisContext ctx)
    {
        return (int)visit(ctx.expr());
    }

    @Override public Integer visitImpregod(TravisParser.ImpregodContext ctx) {
        Integer valor = (int)visit(ctx.expr());

        HelloController c = new HelloController();
        c.concatenar(valor.toString());
        return null;
    }

    @Override public Boolean visitCondicionN(TravisParser.CondicionNContext ctx) {if(Integer.parseInt(ctx.NUMERO().getText())==1){
        return true;

    }else if(Integer.parseInt(ctx.NUMERO().getText())==0){
        return false;

    }
    else{
        throw new NullPointerException("Error, condicion no aceptada");
    } }

}
