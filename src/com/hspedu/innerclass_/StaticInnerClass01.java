package com.hspedu.innerclass_;

public class StaticInnerClass01 {
    public static void main(String[] args) {

        Outer10 outer10 = new Outer10();
        outer10.m1();
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        Outer10.Inner10 inner = Outer10.inner10Instance();
        inner.say();

    }
}


class Outer10 {
    private int n1 = 10;
    private static String name = "zhangsan";
    private static void cry() {}
    static class Inner10 {
        private static String name = "xiaosi";
        public void say() {
            System.out.println(Outer10.name);
            cry();
        }

    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public static Inner10 inner10Instance() {
        return new Inner10();
    }
}
