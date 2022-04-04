package com.hspedu.innerclass_;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println(outer02.hashCode());
    }
}



class Outer02 {
    private int n1 = 100;
    private void m2() {
        System.out.println("Outer m2()");
    }

    public void m1() {//method
        final class Inner02 {
            private int n1 = 800;
            public void f1() {

//                Outer02.this.n1 = 3;
                System.out.println("n1=" + Outer02.this.n1);
                System.out.println(Outer02.this.hashCode());
                m2();
            }

        }

        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}

