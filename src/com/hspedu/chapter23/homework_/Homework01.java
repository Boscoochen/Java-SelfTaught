package com.hspedu.chapter23.homework_;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> privateClass = Class.forName("com.hspedu.chapter23.homework_.PrivateTest");
        Object o = privateClass.newInstance();
        Class<?> name = privateClass.getDeclaredField("name").getType();
        System.out.println("name type= " + name);
        Field name1 = privateClass.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(o, "hsp");
        Method getName = privateClass.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}


class PrivateTest {
    private String name = "hellokitty";

    public String getName() {
        return name;
    }
}