package com.hspedu.exception_.homework_;

import java.util.Scanner;

public class Homework01 {

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
    public static void main(String[] args) {
        try{

            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("parameter numbers not right");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            System.out.println(cal(n1, n2));

        }catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}


