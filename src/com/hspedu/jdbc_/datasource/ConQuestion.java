package com.hspedu.jdbc_.datasource;

import com.hspedu.jdbc_.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ConQuestion {
    @Test
    public void testCon() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();
            JDBCUtils.close(null,null,connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("tradition time: " + (end - start));
    }
}
