package com.hspedu.interface_.InterfaceExercise_;

public class InterfaceExercise01 {

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}


interface A {
    int a = 23;
}


class B implements A {

}