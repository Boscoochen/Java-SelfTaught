package com.hspedu.myjdbc_;

public class TestJdbc {
    public static void main(String[] args) {
        OracleJdbcImpl myOracleJdbc = new OracleJdbcImpl();
        myOracleJdbc.getConnection();
        myOracleJdbc.crud();
        myOracleJdbc.close();
    }
}
