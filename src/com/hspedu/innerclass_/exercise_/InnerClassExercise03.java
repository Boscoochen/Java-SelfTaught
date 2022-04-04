package com.hspedu.innerclass_.exercise_;

public class InnerClassExercise03 {
    public InnerClassExercise03 () {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        System.out.println(s2.a);
    }

    class Inner{
        public int a = 5;
    }

    public static void main(String[] args) {
        InnerClassExercise03 innerClassExercise03 = new InnerClassExercise03();
        Inner r = innerClassExercise03.new Inner();
        System.out.println(r.a);
    }
}


//5
//5