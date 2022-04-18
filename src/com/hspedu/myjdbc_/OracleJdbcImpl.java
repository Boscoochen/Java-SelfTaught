package com.hspedu.myjdbc_;

public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("get Oracle connection");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("complete Oracle crud");
    }

    @Override
    public void close() {
        System.out.println("close Oracle connection");
    }
}
