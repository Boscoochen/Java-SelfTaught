package com2.hspjy.chapter07;

public class Object01 {
    public static void main(String[] args) {
        String cat1Name = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2Name = "小花";
        int cat2Age = 100;
        String cat2Color = "花色";

        String[] cat1 = {"小白", "3", "白色"};
        String[] cat2 = {"小花", "100", "花色"};

        Cat cat = new Cat();
        cat.name = "小白";
        cat.age = 3;
        cat.color = "白色";

        Cat cat3 = new Cat();
        cat3.name = "小花";
        cat3.age = 100;
        cat3.color = "花色";

        System.out.println("第一只猫信息" + cat.name + " " + cat.age + " " + cat.color);
        System.out.println("第二只猫信息" + cat3.name + " " + cat3.age + " " + cat3.color);

    }
}

class Cat {
    String name;
    int age;
    String color;
}
