package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Object obj = new Cat();



        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        System.out.println(animal.age);

        Cat cat = (Cat) animal;
        cat.catchMouse();
        cat.sleep();
        cat.run();
        cat.eat();
        System.out.println(cat.age);
//        Dog dog = (Dog) animal;

//        animal.catchMouse();
        System.out.println("ok~");
    }
}
