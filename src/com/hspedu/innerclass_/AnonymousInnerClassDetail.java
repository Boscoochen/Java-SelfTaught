package com.hspedu.innerclass_;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}


class Outer05 {
    private int n1 =99;
    public void f1() {
        Person person = new Person(){
            @Override
            public void hi(String name) {
                System.out.println("n1 = " + n1);
                System.out.println(name);
                System.out.println("anonymous inner class hi() method is overwrote");
            }
        };

        person.hi("simmon");

        new Person(){
            private int n1 = 100;
            @Override
            public void hi(String name) {

                System.out.println("n1 = " + Outer05.this.n1);
                System.out.println("name = " + name);
                System.out.println("anonymous inner class hi() method is overwrote, hi, hahaha");
            }
        }.hi("jack");


    }
}

class Person {
    public void hi(String name) {
        System.out.println("Person hi()");
    }
}


