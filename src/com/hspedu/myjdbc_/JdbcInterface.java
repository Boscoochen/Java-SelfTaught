package com.hspedu.myjdbc_;

public interface JdbcInterface {
    public Object getConnection();
    public void crud();
    public void close();
}
