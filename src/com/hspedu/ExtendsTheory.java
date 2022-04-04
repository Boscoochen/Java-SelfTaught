package com.hspedu;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getAge());
    }
}


class GrandPa {
    String name = "grandpa";
    String hobby = "travel";
    int age = 20;
}

class Father extends GrandPa {
    String name = "Father";
    private int age = 39;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "son";
}
