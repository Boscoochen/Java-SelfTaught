package com.hspedu.generic_;

import java.util.ArrayList;


@SuppressWarnings({"all"})
public class Generic01 {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("旺财", 10));
        list.add(new Dog("发财", 1));
        list.add(new Dog("小黄", 5));

        //list.add(new Cat("招财猫", 8));
        for (Dog o : list) {
            System.out.println(o.getName() + " " + o.getAge());
        }

    }
}


class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
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
}



class Cat {
    private String name;
    private int age;
    public Cat(String name, int age) {
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
}


