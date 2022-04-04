package com.hspedu.HomeWork.Chapter08;

public class Homework14 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("I'm A class");
    }
}

class B extends A {
    public B() {
        System.out.println("I'm B class with empty parameter constructor");
    }
    public B(String name) {
        System.out.println(name + "I'm B class with parameter constructor");
    }
}


class C extends B
{
    public C() {
        this("Hello");
        System.out.println("I'm C class with empty parameter constructor");
    }

    public C(String name) {
        super("hahah");
        System.out.println("I'm C class with parameter constructor");
    }
}

//output
//I'm A class
//I'm B class with empty parameter constructor// wrong:won't call super if has this
//hahahI'm B class with parameter constructor
//I'm C class with parameter constructor
//"I'm C class with empty parameter constructor