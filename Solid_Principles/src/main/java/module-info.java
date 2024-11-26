module com.example.solid_principles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solid_principles to javafx.fxml;
    exports com.example.solid_principles;
}