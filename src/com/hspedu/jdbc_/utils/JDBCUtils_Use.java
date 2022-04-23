package com.hspedu.jdbc_.utils;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class JDBCUtils_Use {
    @Test
    public void testSelect() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "select * from actor where id = ?";
        ResultSet set = null;
        try {
            connection = JDBCUtils.getConnection();
            System.out.println(connection.getClass());
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 3);
            set = preparedStatement.executeQuery();
            while (set.next()) {
                int id = set.getInt("id");
                String name = set.getString("NAME");
                String sex = set.getString("sex");
                Date borndate = set.getDate("borndate");
                String phone = set.getString("phone");
                System.out.print(id + " " + name + " " + sex + " " + borndate + " " + phone + "\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(set, preparedStatement, connection);
        }
    }


    @Test
    public void testDML() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update actor set name = ? where id = ?";
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "hsp");
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
