module com.example.vier_gewinnt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vier_gewinnt to javafx.fxml;
    exports com.example.vier_gewinnt;
}