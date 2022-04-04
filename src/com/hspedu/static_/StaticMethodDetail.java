package com.hspedu.static_;

public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();

//        D.say();
//        new D().ok();
    }
}


class D {
    public int n1 = 100;
    private static int n2 = 200;
    public void say() {

    }

    public static  void hi(){
//        System.out.println(this.n1);
        new D().ok();

//        d.ok();
    }

    public static void hello() {
//        System.out.println(n1);
//        say();

    }

    public void ok() {
        say();
        hello();
        System.out.println(n1 + n2);
    }
}