package com2.hspjy.chapter07;

public class Object03 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.age = 10;
        person1.name = "小明";
        Person1 person2 = person1;
        System.out.println(person2.age);
    }
}

class Person1 {
    String name;
    int age;
}