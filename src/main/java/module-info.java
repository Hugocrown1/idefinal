module com.ide.ide {
    requires javafx.controls;
    requires javafx.fxml;
    requires antlr;



    opens com.ide.ide to javafx.fxml;
    exports com.ide.ide;
}