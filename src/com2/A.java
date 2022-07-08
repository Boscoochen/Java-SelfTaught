package com2;

public class A {
    public static void main(String[] args) {
        A.getInstance();
    }
    private A(){
    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个

    private static A instance = new A();

    //public static 方法，提供给调用者获取对象
    public static A getInstance(){
        return instance;
    }
}
