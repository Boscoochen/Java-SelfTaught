package com.hspedu.exception_;

public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            String str = "smith";
            int a = Integer.parseInt(str);
            System.out.println("number: " + str);
        } catch (NumberFormatException e) {
            System.out.println("exception: " + e.getMessage() );
        } finally {
            System.out.println("finally code block runs");
        }
        System.out.println("program continue");
    }
}


