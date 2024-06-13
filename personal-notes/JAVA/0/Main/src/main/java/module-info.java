module com.tanish.main {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.tanish.main to javafx.fxml;
    exports com.tanish.main;
}