package com.hspedu.interface_;

public class Computer {

    public void work(Usbinterface usbinterface) {
        usbinterface.start();
        usbinterface.stop();
    }
}
