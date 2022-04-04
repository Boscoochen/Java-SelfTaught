package com.hspedu.houserent.utils;

public class TestUtility {
    public static void main(String[] args) {
        //this is test class, delete after testing

        //request to input a string, length at least 3 characters
//        String s = Utility.readString(3);
//        System.out.println("s= " +  s);

        String s2 = Utility.readString(10, "hspedu");

        System.out.println("s2= " + s2);
    }
}
