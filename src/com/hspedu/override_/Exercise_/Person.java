package com.hspedu.override_.Exercise_;

public class Person {
    private String name;
    private int age;

//    public Person() {
//
//    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say () {
        return "Hello, my name is " + this.name + " i'm " + this.age + " years old";
    }
}
