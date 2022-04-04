package com.hspedu.interface_;

public class MySqlDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("connect mysql");
    }

    @Override
    public void close() {
        System.out.println("close mysql");
    }
}
