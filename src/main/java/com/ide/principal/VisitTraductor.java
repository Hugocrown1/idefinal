package com.ide.principal;


import com.ide.parser.TraductorBaseVisitor;
import com.ide.parser.TraductorParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class VisitTraductor extends TraductorBaseVisitor<String> {
   static String traduce ="";

    File archivo=new File("src/main/traduccion.txt");
    PrintWriter printw = null;

    @Override public String visitInicio(TraductorParser.InicioContext ctx){
                traduce = "astro world(){\n";

        return null;
    }

    @Override public String visitIfGod(TraductorParser.IfGodContext ctx){
        traduce = traduce + "dis (" + ctx.condicion().getText() + ") { \n";
        if (ctx.declaraciones() != null) {
            visit(ctx.declaraciones());
        }
        traduce = traduce + "}\n";
        if (ctx.elseIf_state() != null) {
            for (TraductorParser.ElseIf_stateContext elseif : ctx.elseIf_state()) {
                visit(elseif);
            }
        }
        if (ctx.else_state() != null) {
            visit(ctx.else_state());
        }
        return null;
    }

    @Override public String visitElseifgod(TraductorParser.ElseifgodContext ctx) {
        traduce = traduce + "antidote dis ("+ctx.condicion().getText()+") { \n";
        if(ctx.declaraciones()!=null) {
            visit(ctx.declaraciones());
        }
        traduce = traduce + "}  ";
        return null;
    }
    @Override public String visitElseGod(TraductorParser.ElseGodContext ctx) {

        traduce=traduce+"antidote{\n";

        if(ctx.declaracionesElse()!=null){
            visit(ctx.declaracionesElse());
        }
        traduce=traduce+"}";
        return null;
    }

    @Override public String visitWhileGod(TraductorParser.WhileGodContext ctx) {
        traduce = traduce + "rodeo(" + ctx.condicion().getText() + ") { \n";
        if (ctx.declaraciones() != null) {
            visit(ctx.declaraciones());
        }
        traduce = traduce + "}\n";

        return null;
    }

    @Override public String visitDeclaragod(TraductorParser.DeclaragodContext ctx) {
            traduce = traduce + "lit " + ctx.ID().getText() + ";\n";

        return null;
    }

    @Override public String visitDeclarasigod(TraductorParser.DeclarasigodContext ctx) {
        traduce = traduce + "lit " + ctx.ID().getText() + " = "+ctx.expr().getText()+";\n";
        return null;
    }

    @Override public String visitImpregod(TraductorParser.ImpregodContext ctx) {
        traduce = traduce + "outwest ("+ctx.expr().getText()+");\n";

        return null;
    }

    @Override public String visitAsignagod(TraductorParser.AsignagodContext ctx) {
        traduce = traduce + ctx.ID().getText() +"="+ ctx.expr().getText()+";\n";

        return null;
    }

    public void cerrar(){
        try {
            FileWriter fichero =  new FileWriter(archivo);
            printw = new PrintWriter(fichero);
            if(!traduce.isEmpty()) {
                printw.println(traduce + "}");
            }
            printw.close();
            traduce="";
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
