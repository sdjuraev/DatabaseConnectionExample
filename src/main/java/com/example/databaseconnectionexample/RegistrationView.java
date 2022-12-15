package com.example.databaseconnectionexample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class RegistrationView {
    @FXML
    Button regButton;
    @FXML
    TextField customerID, name, contact,balance;
    @FXML
    DatePicker datePicker;

    @FXML
    private void setRegButton() throws SQLException {
        dbConnection db=new dbConnection();
        db.insertData("INSERT INTO customer (customerID, name, contact, email, balance, regDate, password) VALUES ('"+customerID.getText()+"','"+name.getText()+"','"+contact.getText()+"','random','"+balance.getText()+"','"+datePicker.getValue()+"','11111')");

    }
}
