package com.hspedu.extend_.exercise02;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        C c = new C();
    }
}


class A {
    public A() {
        System.out.println("i'm A class");
    }
}


class B extends A {
    public B() {
        System.out.println("i'm empty constructor B class");
    }

    public B(String name) {
        System.out.println(name + " im B class constructor with String parameter");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("i'm empty constructor C class");
    }

    public C(String name) {
        super("hahah");
        System.out.println("Im C class parameter constructor");
    }
}