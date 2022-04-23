package com.hspedu.jdbc_.transaction_;

import com.hspedu.jdbc_.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.*;

public class Transaction_ {
    @Test
    public void noTransaction() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            int i = 1/0;
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
            preparedStatement1.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }

    @Test
    public void useTransaction() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement1 = connection.prepareStatement(sql2);
            preparedStatement1.executeUpdate();

            connection.commit();
        } catch (Exception e) {
            System.out.println("exception occur, rollback dismissed changes");
            connection.rollback();
            throw new RuntimeException(e);
        }finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
