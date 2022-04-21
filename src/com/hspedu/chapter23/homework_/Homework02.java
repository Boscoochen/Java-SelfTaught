package com.hspedu.chapter23.homework_;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, NoSuchMethodException, InvocationTargetException {
        Class<File> fileClass = File.class;
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("===");
        Constructor<File> declaredConstructor = fileClass.getDeclaredConstructor(String.class);
        File file = declaredConstructor.newInstance("/Applications/hsp2.txt");
        Method method = fileClass.getMethod("createNewFile");
        method.invoke(file);


    }
}
