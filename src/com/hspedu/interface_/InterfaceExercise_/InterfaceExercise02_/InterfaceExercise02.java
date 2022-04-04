package com.hspedu.interface_.InterfaceExercise_.InterfaceExercise02_;

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class InterfaceExercise02 extends B implements A {
    public void pX() {
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new InterfaceExercise02().pX();
    }
}


//super.x, output 1
//A.x, output 0