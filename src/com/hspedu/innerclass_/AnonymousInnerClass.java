package com.hspedu.innerclass_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}




class Outer04 {
    private int n1 = 10;
    public void method() {
//        IA tiger = new Tiger();
//        tiger.cry();
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("Tiger cry");
            }
        };
        System.out.println("tiger run type= " + tiger.getClass());
        tiger.cry();

        Father father = new Father("jack") {

            @Override
            public void test() {
                super.test();
                System.out.println("Father class test() is overwrite");
            }
        };
        System.out.println("Father run type= " + father.getClass());
        father.test();

        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("Animal class eat() is overwrite");
            }
        };
        animal.eat();
        System.out.println(animal.getClass());
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("tiger cry");
//    }
//}
//
//class Dog implements IA {
//    @Override
//    public void cry() {
//        System.out.println("dog cry");
//    }
//}
class Father {
    public Father(String name) {
        System.out.println(name);
    }
    public void test(){

    }
}


abstract class Animal {
    abstract void eat();
}