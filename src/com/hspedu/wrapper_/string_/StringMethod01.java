package com.hspedu.wrapper_.string_;

public class StringMethod01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println(str1.equalsIgnoreCase(str2));
        String s1 = "wer@terwe@g";
        int index = s1.lastIndexOf('@');
        System.out.println(index);
        String name = "Hello, zhangsan";
        System.out.println(name.substring(0,6));
    }
}
