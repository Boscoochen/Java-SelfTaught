package com.hspedu.exception_.throws_;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() throws ArithmeticException {
        int n1 = 10;
        int n2 = 0;

//        double res = n1 / n2;
    }
}

class Father {
    public void method() throws Throwable {}
}

class Son extends Father {
    public void method() throws Exception {}
}


