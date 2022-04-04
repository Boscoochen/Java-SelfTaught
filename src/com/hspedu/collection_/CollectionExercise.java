package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("jack", 10));
        list.add(new Dog("smith", 3));
        list.add(new Dog("milan", 4));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        iterator = list.iterator();
        System.out.println("===========");
        for (Object o :list) {
            System.out.println(o);
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}