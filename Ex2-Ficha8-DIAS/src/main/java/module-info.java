module com.example.ex2ficha8dias {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.ex2ficha8dias to javafx.fxml;
    exports com.example.ex2ficha8dias;
}