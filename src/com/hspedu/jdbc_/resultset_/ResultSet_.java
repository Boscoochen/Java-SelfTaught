package com.hspedu.jdbc_.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Connection connection = null;
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        String sql = "select id, NAME, sex, borndate from actor";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            System.out.println(id + " " + name + " " + sex + " " + date);

        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
