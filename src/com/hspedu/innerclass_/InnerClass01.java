package com.hspedu.innerclass_;

public class InnerClass01 {
    public static void main(String[] args) {

    }
}


class Outer { //
    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }

    public void m1() {
        System.out.println("m1()");
    }

    {
        System.out.println("block");
    }

    class Inner { //inner class

    }
}