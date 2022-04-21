package com.hspedu.chapter23.refection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> bossCls = Class.forName("com.hspedu.chapter23.refection.Boss");
        Object o = bossCls.newInstance();
        Method hi1 = bossCls.getDeclaredMethod("hi", String.class);
        hi1.invoke(o, "hsp");
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
        System.out.println(say.invoke(o, 1, "hsp", 'h'));
        System.out.println(say.invoke(null, 2, "smith", 's'));
        Object reVal = say.invoke(null, 3, "scptt", 'a');
        System.out.println(reVal.getClass());

    }
}


class Boss {
    public int age;
    private static String name;

    public Boss() {

    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void  hi(String s) {
        System.out.println("hi " + s);
    }
}