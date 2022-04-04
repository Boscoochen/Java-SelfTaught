package com.hspedu.enum_.homework_;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.func();
    }
}


class A {
    private String name = "jack";
    public void func() {
        class B {
            private String name = "smith";
            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}