package com.hspedu.jdbc_;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/db02";
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "yonghuachen");
        Connection connect = driver.connect(url, properties);

//        String sql = "insert into actor values(null, 'andy lou', 'm', '1970-11-11','110')";
//        String sql = "update actor set name = 'stephen chou' where id = 1";
        String sql = "delete from actor where id = 2";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println(rows > 0 ? "success" : "fail");


        statement.close();
        connect.close();
    }
}
