package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        // new IA();
    }
}


interface IA {
    void say();
    void hi();
}


abstract class Dog implements IA {

}

class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}