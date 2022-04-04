package com.hspedu.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
    }
}

final class AAA {
    public final void cry() {

    }

}

class BBB {
    public final static int num = 10000;

    static {
        System.out.println("BBB static constructor is called");
    }
}

