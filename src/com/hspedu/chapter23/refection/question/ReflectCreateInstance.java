package com.hspedu.chapter23.refection.question;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> userClass = Class.forName("com.hspedu.chapter23.refection.question.User");
        Object o = userClass.newInstance();
        System.out.println(o);
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object o1 = constructor.newInstance("hsp");
        System.out.println(o1);
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);
        Object smith = constructor1.newInstance(2, "smith");
        System.out.println(smith);
    }
}


@SuppressWarnings({"all"})
class User {
    private int age = 100;
    private String name = "hspedu";

    public User() {

    }

    public User(String name) {
        this.name = name;
    }


    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}