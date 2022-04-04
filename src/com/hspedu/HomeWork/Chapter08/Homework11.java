package com.hspedu.HomeWork.Chapter08;

public class Homework11 {
    public static void main(String[] args) {
        Person1 p = new Student();
        p.run();
        p.eat();

        ((Student)p).study();
        ((Student)p).run();
        ((Student)p).eat();
    }
}


class Person1 {
    public void run(){
        System.out.println("person run");
    }
    public void eat() {
        System.out.println("person eat");
    }
}

class Student extends Person1{
    public void run() {
        System.out.println("Student run");
    }

    public void study() {
        System.out.println("student study...");
    }
}

//