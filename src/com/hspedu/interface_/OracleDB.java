package com.hspedu.interface_;

public class OracleDB implements DBInterface{

    @Override
    public void connect() {
        System.out.println("Connect oracle");
    }

    @Override
    public void close() {
        System.out.println("Close oracle");
    }
}
