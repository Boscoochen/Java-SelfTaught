package com.hspedu.jdbc_.exercise_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Exercise02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
//        String username = "king";
        String sql = "Select * from admin;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            System.out.print(resultSet.getString(1) + " " + resultSet.getString(2) + "\n");
        }
        connection.close();
        preparedStatement.close();
        resultSet.close();
    }
}
