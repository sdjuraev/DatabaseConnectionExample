package com.example.databaseconnectionexample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    Button register, LoginButton;
    @FXML
    TextField loginText;
    @FXML
    PasswordField passwordText;

    @FXML
    private void setRegister() throws IOException {
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Registration");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void checkUser() throws SQLException {
        dbConnection dbConnection=new dbConnection();
        ResultSet resultSet;
        resultSet= dbConnection.getData("SELECT name, password FROM customer");
        while (resultSet.next()){
            if ((loginText.getText().compareTo(resultSet.getString(1).toString())==0) &&
            passwordText.getText().compareTo(resultSet.getString(2).toString())==0) {
                System.out.println("User found"+resultSet.getString(1).toString()+"and log in successfully");
            }


            //System.out.println(+"  "+resultSet.getString(2));
        }
    }



}