module br.edu.iftm.javafx4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens br.edu.iftm.javafx4 to javafx.fxml;
    exports br.edu.iftm.javafx4;
}