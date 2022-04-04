package com.hspedu.single_;

public class SignalTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        Cat instance2= Cat.getInstance();
        System.out.println(instance);
    }
}



class Cat {
    private String name;
    private static Cat cat;
    public static int n1 = 3;

    private Cat(String name) {
        System.out.println("Cat constructor is called");
        this.name = name;
    }

    public static Cat getInstance(){
        if(cat == null) {
            cat = new Cat("xiaokeai");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}