package com.hspedu.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(A.setName());
        A a = new A();
        System.out.println(a.setName());
    }

}

class A {
    private static String name = "teaching";
    private int num = 10;
    public static String setName() {
        return name;
    }
}
