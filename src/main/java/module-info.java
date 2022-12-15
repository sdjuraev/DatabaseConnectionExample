module com.example.databaseconnectionexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.databaseconnectionexample to javafx.fxml;
    exports com.example.databaseconnectionexample;
}