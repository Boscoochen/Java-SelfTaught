package com.hspedu.innerclass_.exercise_;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        //class InnerClassExercise01$1 implements IL {}
        f1(new IL(){
            @Override
            public void show() {
                System.out.println("overwrote interface IL show() method");
            }
        });

        f1(new Picture());
    }

    public static void f1(IL il) {
        il.show();
    }
}


interface IL {
    void show();
}


class Picture implements IL {
    @Override
    public void show() {
        System.out.println("this is famous picture");
    }
}