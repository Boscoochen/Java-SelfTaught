package com.hspedu.exception_;

public class ThrowException {
}


class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("into method A");
            throw new RuntimeException("making exception");
        }finally {
            System.out.println("using A method finally");
        }
    }
    static void methodB() {
        try{
            System.out.println("int method B");
            return;
        }finally {
            System.out.println("call B method finally");
        }
    }

    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ReturnExceptionDemo.methodB();
    }
}
//into method A
//using A method finally
//making exception
//int method B
//call B method finally

