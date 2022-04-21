package com.hspedu.chapter23.refection.class_;

import com.hspedu.Car;
import com.hspedu.Cat;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forname
        String classAllPath = "com.hspedu.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);
        //2. Class.class
        Class cls2 = Car.class;
        System.out.println(cls2);
        //3. instance.getClass
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);
        //4. classloader
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        System.out.println(cls.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());


        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);

        Class<Integer> type = Integer.TYPE;
        System.out.println(type);

        System.out.println(integerClass.hashCode());
        System.out.println(type.hashCode());
    }
}
