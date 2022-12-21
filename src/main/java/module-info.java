module com.example.databaseconnectionexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;
    opens com.example.databaseconnectionexample to javafx.fxml;
    exports com.example.databaseconnectionexample;
}