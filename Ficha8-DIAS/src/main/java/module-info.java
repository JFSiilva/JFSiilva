module org.example.ficha8dias {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.ficha8dias to javafx.fxml;
    exports org.example.ficha8dias;
}