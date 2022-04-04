package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dahuang = new Dog("dahuang");
        Bone dabanggu = new Bone("dabanggu");


        tom.feed(dahuang, dabanggu);
        System.out.println("=============");

        Cat xiaohuamao = new Cat("xiaohuamao");
        Fish huanghuayu = new Fish("huanghuayu");
        tom.feed(xiaohuamao, huanghuayu);

        System.out.println("=============");

        Animal animal = new Dog("dahuang");
        Food food = new Bone("dabanggu");
        tom.feed(animal, food);
        System.out.println("=============");
        animal = new Cat("xiaohuamao");
        food = new Fish("huanghuayu");
        tom.feed(animal, food);

        System.out.println("=============");

        //add feed pig rice
        Pig pig = new Pig("xiaohuazhu");
        Rice rice = new Rice("mifan");

        tom.feed(pig, rice);



    }
}
