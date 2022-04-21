package com.hspedu.chapter23.refection.classload_;

public class classload03 {
    public static void main(String[] args) {
        System.out.println(B.num);
    }
}


class B {
    static {
        System.out.println("static block run");
        num = 300;
    }

    static int num = 100;
    public B() {
        System.out.println("B() constructor run");
    }
}