module com.example.magic_8_ball {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.magic_8_ball to javafx.fxml;
    exports com.example.magic_8_ball;
}