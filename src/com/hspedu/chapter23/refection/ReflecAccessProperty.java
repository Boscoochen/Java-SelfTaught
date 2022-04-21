package com.hspedu.chapter23.refection;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> stuClass = Class.forName("com.hspedu.chapter23.refection.Student");
        Object o = stuClass.newInstance();
        System.out.println(o.getClass());

        Field age = stuClass.getField("age");
        age.set(o, 88);
        System.out.println(o);
        System.out.println(age.get(o));
        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(null, "hsp");
        System.out.println(o);
        System.out.println(name.get(o));
        System.out.println(name.get(null));
    }
}


class Student {
    public int age;
    private static String name;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age + "name=" + name +
                '}';
    }
}