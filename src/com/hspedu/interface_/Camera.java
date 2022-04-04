package com.hspedu.interface_;

public class Camera implements Usbinterface{

    @Override
    public void start() {
        System.out.println("Camera start");
    }


    @Override
    public void stop() {
        System.out.println("Camera stop");
    }

}
