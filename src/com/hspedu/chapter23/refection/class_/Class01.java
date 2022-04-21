package com.hspedu.chapter23.refection.class_;

import com.hspedu.Cat;

public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {

//        Cat cat = new Cat();
        Class cls1 = Class.forName("com.hspedu.Cat");
        Class cls2 = Class.forName("com.hspedu.Cat");
        Class cls3 = Class.forName("com.hspedu.Dog");

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
    }
}
