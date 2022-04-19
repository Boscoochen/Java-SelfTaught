package com.hspedu.chapter23.refection.question;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@SuppressWarnings({"all"})
public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/chapter23/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
//        System.out.println(o.getClass());
        Method method1 = cls.getMethod(methodName);
        method1.invoke(o);

        Field name = cls.getField("name");
        System.out.println(name.get(o));

        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);
        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);
    }
}
