package com.example.databaseconnectionexample;

import java.sql.*;

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
    public ResultSet getData(String sqlCommand) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost/bolt","root","");
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery(sqlCommand);
        return resultSet;
    }

}
