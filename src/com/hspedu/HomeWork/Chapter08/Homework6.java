package com.hspedu.HomeWork.Chapter08;

public class Homework6 {
}

class Grand {
    String name="AA";
    private int age = 100;
    public void g1(){}
}

class Father extends Grand{
    String id = "001";
    private double score;
    public void f1() {
        //what attributes and methods can super access
        // String name="AA";
        //public void g1(){


        //what attributes and methods can this access
        //String id = "001";
        //private double score;
        //f1()
        //String name="AA";
        // public void g1(){}
    }
}


class Son extends Father {
    String name = "BB";
    public void g1(){}
    private void show() {
        //what attributes and methods can super access
        //super.id super.f1() super.name super.g1()

        //what attributes and methods can this access
        //this.name this.g1() this.show() this.id this.f1()
    }
}
