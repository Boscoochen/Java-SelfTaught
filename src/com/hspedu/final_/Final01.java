package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
//        e.Tax_RATE = 0.09;
    }
}



final class A {

}


//class B extends A {
//
//}

class C{
    public final void hi() {}
}

class D extends C {
//    @Override
//    public void hi() {
//        System.out.println("overwrite C class hi method");
//    }
}


class E {
    public final double Tax_RATE = 0.08;
}

class F{
    public void cry() {
        final double NUM = 0.01;
//        NUM = 0.9;
        System.out.println("Num= " + NUM);
    }
}