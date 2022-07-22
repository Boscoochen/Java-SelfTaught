package com2.hspjy.chapter07;

public class Method01 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.speak();
        p1.cal01();
        p1.cal02(1000);

        int returnRes = p1.getSum(10, 20);
        System.out.println("getSum方法返回的值=" + returnRes);
    }
}

class Person2 {
    String name;
    int age;

    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01() {
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("cal01计算结果=" + res);
    }

    public void cal02(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("cal02计算结果=" + res);
    }

    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}