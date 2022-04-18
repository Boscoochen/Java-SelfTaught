package com.hspedu.properties_.homework_;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.setProperty("name", "tom");
        properties.setProperty("age", "5");
        properties.setProperty("color", "red");
        properties.store(new FileWriter("src/com/hspedu/properties_/mysql3.properties"), null);

        System.out.println("store complete");

        Dog dog = new Dog(properties.getProperty("name"), Integer.parseInt(properties.getProperty("age")), properties.getProperty("color"));
        System.out.println(dog);

        String serFile = "/Applications/dog.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream((new FileOutputStream(serFile)));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

    }


    @Test
    public void m1() throws Exception{
        String serFile = "/Applications/dog.dat";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(serFile));
        Dog dog = (Dog)objectInputStream.readObject();
        System.out.println(dog);
        objectInputStream.close();
    }
}


class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
