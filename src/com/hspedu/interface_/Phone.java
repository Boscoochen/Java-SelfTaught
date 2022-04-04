package com.hspedu.interface_;


public class Phone implements Usbinterface{

    @Override
    public void start() {
        System.out.println("phone start");
    }

    @Override
    public void stop() {
        System.out.println("phone stop");
    }
}
