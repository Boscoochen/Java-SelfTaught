package com.hspedu.Object_.finalize_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        bmw = null;
        System.gc();
        System.out.println("program quit");
    }
}


class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("we destroy car" + name);
        System.out.println("release resources..");
    }
}