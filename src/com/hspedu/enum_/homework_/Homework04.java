package com.hspedu.enum_.homework_;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 3, 4);

    }
}


interface Calculator {
    public double work(double n1, double n2);
}

class Cellphone{

    public void testWork(Calculator cal, double n1, double n2) {
        double result =  cal.work(n1, n2);
        System.out.println(result);
    }



}