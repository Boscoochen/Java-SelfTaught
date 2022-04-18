package com.hspedu.file_.ouputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/text01/data.dat";
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filePath));

        os.writeInt(100);
        os.writeBoolean(true);
        os.writeChar('a');
        os.writeDouble(9.5);
        os.writeUTF("韩顺平");

        os.writeObject(new Dog("smith", 10,"white"));
        os.close();
        System.out.println("data store complete");
    }
}


class Dog implements Serializable {
    private String name;
    private int age;
    private static String nation;
    private transient String color;
    private Master master = new Master();
    private static final long serialVersionUID = 1L;
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Dog.nation = nation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", master=" + master +
                '}';
    }
}