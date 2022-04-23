package com.hspedu.jdbc_.preparestatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatement_ {
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
//        String sql = "select name, pwd from admin where NAME = ? and pwd = ?";

        //insert
//        String sql = "insert into admin values(?, ?)";

        //update
        String sql = "update admin set pwd = ? where NAME = ?";
        //delete
//        String sql = "delete from admin where NAME = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, admin_password);
        preparedStatement.setString(2, admin_name);
        int i = preparedStatement.executeUpdate();
        System.out.println(i > 0 ? "succeed" : "fail");

        preparedStatement.close();
        connection.close();
    }
}
