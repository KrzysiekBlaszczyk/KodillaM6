module com.example.kodillagoodpatterns {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kodilla.good.patterns to javafx.fxml;
    exports com.example.kodilla.good.patterns;
}