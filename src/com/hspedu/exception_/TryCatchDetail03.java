package com.hspedu.exception_;

public class TryCatchDetail03 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            System.out.println(n1 / n2);
        } finally {
            System.out.println("run finally");
        }

        System.out.println("program continue");
    }
}
