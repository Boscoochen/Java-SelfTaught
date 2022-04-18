package com.hspedu.myjdbc_;

public class MysqlJdbcImpl implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("get mysql connection");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("complete mysql crud");
    }

    @Override
    public void close() {
        System.out.println("close mysql connection");
    }
}
