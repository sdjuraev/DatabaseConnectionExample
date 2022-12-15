package com.example.databaseconnectionexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnection {
    public void insertData(String sqlCommand) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/bolt","root","");
        Statement statement=con.createStatement();
        if (statement.executeUpdate(sqlCommand)>0)
        {
            System.out.println("Data inserted successfully");
        }
        else {
            System.out.println("Something went wrong");
        }




    }
}
