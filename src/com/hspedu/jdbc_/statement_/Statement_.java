package com.hspedu.jdbc_.statement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Statement_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter admin username:");
        String admin_name = scanner.nextLine();
        System.out.println("enter admin password:");
        String admin_password = scanner.nextLine();

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
        String sql = "select name, pwd from admin where name ='"+admin_name+"' and pwd = '"+admin_password+"' ";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()) {
            System.out.println("login succeed");
        }else {
            System.out.println("login fail");
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
