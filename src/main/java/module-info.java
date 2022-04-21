module com.example.wolfpackairlines {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires org.testng;
    requires com.opencsv;
    requires org.apache.pdfbox;
    requires itextpdf;

    opens com.example.wolfpackairlines to javafx.fxml;
    exports com.example.wolfpackairlines;
}