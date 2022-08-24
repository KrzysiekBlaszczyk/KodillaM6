module com.example.kodilla.spring.intro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.spring.intro to javafx.fxml;
    exports com.kodilla.spring.intro;
}