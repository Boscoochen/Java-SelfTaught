package com.hspedu.innerclass_;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.t1();


        Outer01.Innter01 innter01 = outer01.new Innter01();

        innter01.say();

        outer01.getInner01Instance().say();


    }
}




class Outer01 {
    private int n1 = 10;
    public String name = "Zhangsan";
    private void cry(){}
    private void hi(){}
    class Innter01 {
        private int n1 = 66;
        private double sal = 99.9;
        public void say() {
            System.out.println("Outer01's n1 = " + n1 +
                    " Outer01's name = " + name);
            hi();
            cry();
            System.out.println(Outer01.this.n1);
        }

    }

    public Innter01 getInner01Instance() {
        return new Innter01();
    }
    public void t1() {
        Innter01 innter01 = new Innter01();
        innter01.say();
        System.out.println(innter01.sal);
    }
}