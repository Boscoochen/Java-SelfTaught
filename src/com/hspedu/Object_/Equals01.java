package com.hspedu.Object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;

        System.out.println(a == c);
        System.out.println(b == c);

        B bObj = a;
        System.out.println(bObj == c);

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        "hello".equals("abc");

        Integer integer = new Integer(5);
        Integer integer1 = new Integer(5);
        System.out.println(integer1 == integer);
        System.out.println(integer1.equals(integer));
        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class B {
}

class A extends B{

}
