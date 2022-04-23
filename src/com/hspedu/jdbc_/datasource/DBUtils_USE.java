package com.hspedu.jdbc_.datasource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.List;

@SuppressWarnings({"all"})
public class DBUtils_USE {
    @Test
    public void testQueryMany() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
//        String sql = "select * from actor where id >= ?";
        String sql = "select id, NAME from actor where id >= ?";
        List<Actor> list =
                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        for (Actor actor : list) {
            System.out.println(actor);
        }
        JDBCUtilsByDruid.close(null, null, connection);
    }

    @Test
    public void testQuerySingle() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id = ?";
        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 4);
        System.out.println(actor);
        JDBCUtilsByDruid.close(null, null, connection);
    }

    @Test
    public void testScalar() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select NAME from actor where id = ?";
        Object obj = queryRunner.query(connection, sql, new ScalarHandler<>(), 4);
        System.out.println(obj);
        JDBCUtilsByDruid.close(null, null, connection);
    }

    @Test
    public void testDML() throws SQLException {
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();
//        String sql = "update actor set NAME = ? where id = ?";
//        String sql = "insert into actor values(? , ? , ?, ?, ?)";
        String sql = "delete from actor where id = ?";
        int affectRow = queryRunner.update(connection, sql, 5);
        System.out.println(affectRow > 0 ? "succeed" : "fail");
        JDBCUtilsByDruid.close(null, null, connection);
    }

}
