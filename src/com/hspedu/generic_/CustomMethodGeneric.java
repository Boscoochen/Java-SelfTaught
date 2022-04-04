package com.hspedu.generic_;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fry("bwm", 100);
        car.fry(22.0, 'c');

        new Fish<Integer, String>().hi(111, 'c');
    }
}


class Car {
    public void run() {

    }

    public<T, R> void fry (T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }



}

class Fish<T, R> {
    public void run() {

    }
    public<U, M> void eat(U u, M m) {

    }

    public<Y> void hi(T t, Y y) {
        System.out.println(t.getClass());
        System.out.println(y.getClass());
    }
}