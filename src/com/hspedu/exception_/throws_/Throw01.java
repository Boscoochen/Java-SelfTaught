package com.hspedu.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throw01 {
    public static void main(String[] args) throws FileNotFoundException {
        f1();
    }

    public static void f1() throws FileNotFoundException{
        f2();
    }

    public static void f2() throws FileNotFoundException, NullPointerException, ArithmeticException {

        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
