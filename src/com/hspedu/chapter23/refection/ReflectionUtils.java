package com.hspedu.chapter23.refection;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        Class<?> personCls = Class.forName("com.hspedu.chapter23.refection.Person");
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField: declaredFields) {
            System.out.println(declaredField.getName() + " " + declaredField.getModifiers() + " " + declaredField.getType());
        }
        System.out.println("=====");
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName() + " " + declaredMethod.getModifiers() + " " + declaredMethod.getReturnType());
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }

        System.out.println("=====");
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
        }

    }

    @Test
    public void api_01 () throws ClassNotFoundException {
        Class<?> personCls = Class.forName("com.hspedu.chapter23.refection.Person");
        System.out.println(personCls.getName());
        System.out.println(personCls.getSimpleName());
        Field[] fields = personCls.getFields();
        for (Field field: fields) {
            System.out.println(field.getName());
        }
        System.out.println("=====");
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredfield: declaredFields) {
            System.out.println(declaredfield.getName());
        }
        System.out.println("=====");

        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("=====");
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        System.out.println("=====");
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        System.out.println("=====");
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

        System.out.println("=====");
        System.out.println(personCls.getPackage());
        System.out.println("=====");
        Class<?> superclass = personCls.getSuperclass();
        System.out.println(superclass.getName());
        System.out.println("=====");
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        System.out.println("=====");
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}


class A {
    public String hobby;
    public void hi(){}

    public A() {}
}

interface IA {

}

interface IB{

}


@Deprecated
class Person extends A implements IA,IB{
    public String name;
    protected static int age;
    String job;
    private double sal;

    public Person() {

    }

    public Person(String name) {

    }

    private Person(String name, int age) {}


    public void m1(String name, int age, double sal) {

    }
    protected String m2() {
        return null;
    }

    void m3() {

    }

    private void m4() {

    }
}