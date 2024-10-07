module harrington.lab5tipcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens harrington.lab5tipcalc to javafx.fxml;
    exports harrington.lab5tipcalc;
}