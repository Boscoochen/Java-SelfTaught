package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}


class A {
    public A() {
        System.out.println("A constructor is called");
    }
    private static int n1 = getN1();
    private int n2 = getN2();
    static {
        System.out.println("A static block 01");
    }

    {
        System.out.println("A normal block");
    }


    public static int getN1(){
        System.out.println("getN1()run");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2()run");
        return 200;
    }


}





