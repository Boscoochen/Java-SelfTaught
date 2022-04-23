package com.hspedu.jdbc_.exercise_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Exercise01 {
    @Test
    public void connectMysql() throws IOException, ClassNotFoundException, SQLException {
        Connection connection = null;
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate("delete from news where id = 3");
//        int row = statement.executeUpdate("create table `news`( id INT primary key auto_increment, `title` VARCHAR(32), `content` VARCHAR(32), `date` DATETIME)");
//        for (int i = 0; i < 5; i++) {
//            int row = statement.executeUpdate("insert into news values(null, 's', 'a', current_timestamp())");
//            System.out.println(row > 0 ? "succeed" : "fail");
//        }
//
//        int row = statement.executeUpdate("insert into news values(1, 's', 'a', current_timestamp())");
//        int row = statement.executeUpdate("update news set content = 'hsp' where id = 1");

        System.out.println(row > 0 ? "succeed" : "fail");

        statement.close();
        connection.close();
    }
}


