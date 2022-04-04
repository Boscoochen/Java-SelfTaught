package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
//        tom.payFee(100);
        Stu.payFee(100);
        Stu mary = new Stu("mary");
        Stu.payFee(200);

        Stu.showFee();
        System.out.println(MyTools.calSum(10,20));
    }
}


class MyTools {

    public static double calSum(double n2, double n3) {
        return n2 + n3;
    }
}

class Stu {
    private String name;

    public static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void showFee() {
        System.out.println("total fee= " + Stu.fee);
    }
}
