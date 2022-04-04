package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new B02();
    }
}


class A02 {
    private static int n1 = getVal01(); //n1 = 10
    static {
        System.out.println("A02 is static block");
    }

    {
        System.out.println("A02 is normal block");
    }

    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("getVal01");
        return 10;
    }

    public int getVal02() {
        System.out.println("getVal02");
        return 10;
    }

    public A02() {
        System.out.println("A02's constructor");
    }
}


class B02 extends A02{
    private static int n3 = getVal03(); //n3 = 10

    static{
        System.out.println("B02 is static block..");
    }

    public int n5 = getVal04();

    {
        System.out.println("B02 is normal block");
    }

    public static int getVal03() {
        System.out.println("getVal03");
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04");
        return 10;
    }

    public B02() {
        System.out.println("B02 constructor");
    }
}

//getVal01
//A02 is static block
//getVal03
//B02 is static block..
//A02 is normal block
//getVal02
//A02's constructor
//getVal04
//B02 is normal block
//B02 constructor