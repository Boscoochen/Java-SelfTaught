//package com.hspedu.jdbc_.datasource;
//
//import com.hspedu.jdbc_.datasource.JDBCUtilsDruid;
//import org.junit.jupiter.api.Test;
//
//import java.sql.*;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//
//public class JDBCUtilsByDruid_Use {
//    @Test
//    public void testSelect() {
//        System.out.println("use druid");
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        String sql = "select * from actor where id >= ?";
//        ResultSet set = null;
//        try {
//            connection = JDBCUtilsDruid.getConnection();
//            System.out.println(connection.getClass());
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, 3);
//            set = preparedStatement.executeQuery();
//            while (set.next()) {
//                int id = set.getInt("id");
//                String name = set.getString("NAME");
//                String sex = set.getString("sex");
//                Date borndate = set.getDate("borndate");
//                String phone = set.getString("phone");
//                System.out.print(id + " " + name + " " + sex + " " + borndate + " " + phone + "\n");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            JDBCUtilsDruid.close(set, preparedStatement, connection);
//        }
//    }
//
//    @Test
//    public ArrayList<Actor> testSelectToArrayList() {
//        System.out.println("use druid");
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        String sql = "select * from actor where id >= ?";
//        ResultSet set = null;
//        ArrayList<Actor> list = new ArrayList<Actor>();
//        try {
//            connection = JDBCUtilsDruid.getConnection();
//            System.out.println(connection.getClass());
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, 3);
//            set = preparedStatement.executeQuery();
//            while (set.next()) {
//                int id = set.getInt("id");
//                String name = set.getString("NAME");
//                String sex = set.getString("sex");
//                Date borndate = set.getDate("borndate");
//                String phone = set.getString("phone");
//                list.add(new Actor(id, name, sex, borndate, phone));
//            }
//            System.out.println("list = " + list);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            JDBCUtilsDruid.close(set, preparedStatement, connection);
//        }
//        return list;
//    }
//}
