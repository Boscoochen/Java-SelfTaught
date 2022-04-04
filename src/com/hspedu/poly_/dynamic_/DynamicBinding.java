package com.hspedu.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}


class A {
    public int i = 10;

    public int sum() {
        return getl() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getl() {
        return i;
    }
}


class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getl() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}