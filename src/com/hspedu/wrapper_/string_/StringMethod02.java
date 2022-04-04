package com.hspedu.wrapper_.string_;

import java.util.Locale;

public class StringMethod02 {
    public static void main(String[] args) {
        String s = "heLLo";
        System.out.println(s.toLowerCase());
        String s2 = "Hello";
        s2 = s2.concat("world").concat("!!!!");
        System.out.println(s2);
        s2 = s2.replace("Hello", "jack");
        System.out.println(s2);
        String poem = "hello, world, how, are, you, doing";
        String[] split = poem.split(",");

        String poem2 = "E:\\aaa\\bbb";
        String[] split2 = poem2.split("\\\\");
        for (int i = 0; i < split2.length; i++) {
            System.out.print(split2[i] + " ");
        }
        System.out.println();
        String s4 = "happy";
        char[] chs = s4.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
        System.out.println();
        String a = "jackabc";
        String b = "jack";
        System.out.println(a.compareTo(b));
    }
}
