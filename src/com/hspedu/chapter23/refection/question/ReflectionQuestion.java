package com.hspedu.chapter23.refection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings({"all"})
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Cat cat = new Cat();
//        cat.hi();


        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/chapter23/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
//        System.out.println(classfullpath);
//        System.out.println(methodName);

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
//        System.out.println(o.getClass());
        Method method1 = cls.getMethod(methodName);
        method1.invoke(o);
    }
}
