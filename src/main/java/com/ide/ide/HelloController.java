package com.ide.ide;



import com.ide.parser.*;
import com.ide.principal.MyVerificador;
import com.ide.principal.MyVisitor;
import com.ide.principal.TravisVisitor;
import com.ide.principal.VisitTraductor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.Pane;


import javafx.stage.FileChooser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import java.util.Scanner;


public class HelloController {
    @FXML
    private Pane scene;

    @FXML
    private TextArea entrada;

    @FXML
    private TextArea traduccion;

    @FXML
    private MenuItem cargar;

    @FXML
    private MenuItem traduce;

    @FXML
    private MenuItem guardar;

    @FXML
    private MenuItem ejecutar;

    @FXML
    private MenuItem borrar;

    @FXML
    private TextArea salida;


    @FXML
    private Label welcomeText;


    public static String resultado = new String();


    @FXML
    void agregar(ActionEvent event) {
        entrada.clear();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        File archivo = fileChooser.showOpenDialog(null);
        if (archivo != null) {
            try {
                Scanner input = new Scanner(new File(archivo.getAbsolutePath()));

                while (input.hasNext()) {
                    entrada.appendText(input.nextLine() + '\n');
                }
                input.close();
            } catch (FileNotFoundException ex) {
                System.out.println("File not found: " + archivo.getName());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


    @FXML
    void ejecutar(ActionEvent event) {
        try {
            CharStream input = CharStreams.fromString(traduccion.getText());
            TravisLexer lexico = new TravisLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            TravisParser sintactico = new TravisParser(tokens);
            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException("Error, no es posible ejecutar (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });
            ParseTree arbol = sintactico.programa();
            TravisVisitor visitas = new TravisVisitor();
            MyVerificador verificar = new MyVerificador();
            verificar.visit(arbol);
            visitas.visit(arbol);
            salida.setText(resultado);
        } catch (ParseCancellationException e) {
            salida.setText(e.getMessage());
        } catch (NullPointerException e) {
            salida.setText(e.getMessage());
        } catch (ArithmeticException e) {
            salida.setText("Error, " + e.getMessage());
        } finally {
            resultado = "";
        }
    }

    @FXML
    void traducir(ActionEvent event) {

        try {
            salida.clear();
            traduccion.clear();
            CharStream input = CharStreams.fromString(entrada.getText());
            TraductorLexer lexico = new TraductorLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexico);
            TraductorParser sintactico = new TraductorParser(tokens);

            sintactico.removeErrorListeners();
            sintactico.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                        throws ParseCancellationException {
                    throw new ParseCancellationException(msg + " Error, la entrada a traducir no es correcta (linea " + line + ", caracter " + charPositionInLine + ").");
                }
            });

            ParseTree arbol = sintactico.programa();
            VisitTraductor visitas = new VisitTraductor();
            visitas.visit(arbol);
            visitas.cerrar();

            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {
                archivo = new File("src/main/traduccion.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null)
                    traduccion.appendText(linea + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            resultado = "";
        } catch (ParseCancellationException e) {
            salida.setText(e.getMessage());
            resultado="";
        }
    }



    @FXML
    void guardar(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (.txt)", ".txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showSaveDialog(null);

        if (file != null) {
            guardarTexto(entrada.getText(), file);
        }
    }

    void guardarTexto(String texto, File file) {
        try {
            PrintWriter writer;
            writer = new PrintWriter(file);
            writer.println(texto);
            writer.close();
        } catch (IOException e) {
            salida.setText(e.getMessage());
        }
    }

    public void concatenar(String valor) {
        resultado += " "+valor + "\n";
    }



    @FXML
    void borrar(ActionEvent event){
        entrada.clear();
        salida.clear()
        ;
    }

}