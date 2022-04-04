package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }

}


class AAA {

    public AAA() {
        System.out.println("AAA() constructor is called...");
    }
    static {
        System.out.println("AAA's static block...");


    }
}


class BBB extends  AAA{

    {
        System.out.println("BBB's normal block...");
    }




    public BBB() {
        System.out.println("BBB() constructor is called ...");
    }

    static {
        System.out.println("BBB's static block...");


    }
}