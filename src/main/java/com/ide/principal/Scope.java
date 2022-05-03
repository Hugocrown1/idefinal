package com.ide.principal;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private Scope parent;
    private HashMap<String, Integer> variables;

    Scope() {
        this.parent=null;
        this.variables=new HashMap<>();
    }

    Scope(Scope p) {
        this.parent = p;
        this.variables = new HashMap<>();
    }

    public Scope parent() {
        return parent;
    }

    public void declarar(String var) {
        if(!buscar(var)) {
            variables.put(var,null);
        }
        else {
            throw new NullPointerException("Variable ya declarada: "+var);
        }
    }

    public void asignar(String var, int value) {
        if(variables.containsKey(var)) {
            variables.replace(var, value);
        }
        else if(parent != null) {
            parent.asignar(var, value);
        } else {
            throw new NullPointerException("Esta variable no existe: "+var);
        }
    }

    public boolean buscar(String var) {
        if(variables.containsKey(var)) {
            return true;
        }
        else if(parent != null) {
            return parent.buscar(var);
        } else {
            return false;
        }
    }

    public int regresar(String var){
        if(variables.containsKey(var)){
            if (variables.get(var)!=null) {
                return variables.get(var);
            }
            else {
                throw new NullPointerException("Variable sin valor: "+var);
            }
        } else if(parent != null) {
            return parent.regresar(var);
        } else {
            throw new NullPointerException("Esta variable no existe: "+var);
        }
    }

}
