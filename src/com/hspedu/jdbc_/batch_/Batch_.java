package com.hspedu.jdbc_.batch_;

import com.hspedu.jdbc_.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Batch_ {
    @Test
    public void noBatch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }

        long end = System.currentTimeMillis();
        System.out.println("tradition time: " + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);
    }

    @Test
    public void Batch() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.addBatch();
            if ((i + 1) % 1000 == 0){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }

        }

        long end = System.currentTimeMillis();
        System.out.println("batch time: " + (end - start));

        JDBCUtils.close(null, preparedStatement, connection);
    }
}
