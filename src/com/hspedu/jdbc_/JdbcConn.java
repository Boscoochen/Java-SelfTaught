package com.hspedu.jdbc_;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConn {

    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "yonghuachen");
        Connection connect = driver.connect(url, properties);

        System.out.println(connect);
    }


    @Test
    public void connect02() throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "yonghuachen");

        Connection connect = null;
        try {
            connect = driver.connect(url, properties);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connect);
    }

    @SuppressWarnings({"all"})
    @Test
    public void connect03() {
        Connection connection = null;
        try {
            Class<?> aClass = Class.forName(("com.mysql.jdbc.Driver"));
            Driver driver = (Driver)aClass.newInstance();
            String url = "jdbc:mysql://localhost:3306/db02";
            String user = "root";
            String password = "yonghuachen";

            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(connection);

    }


    //recommend
    @Test
    public void connect04() throws ClassNotFoundException, SQLException {
        Connection connection = null;

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db02";
        String user = "root";
        String password = "yonghuachen";
        connection = DriverManager.getConnection(url, user, password);

        System.out.println(connection);
    }

    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Connection connection = null;
        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
