package com.hspedu.wrapper_;

public class Homework04 {
    public static void main(String[] args) {
        String str = "D0sSd02S931";
        System.out.println(func(str));
    }

    public static String func(String str) {
        int upper = 0;
        int lower = 0;
        int digital = 0;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                upper++;
            }else if(chars[i] >= 'a' && chars[i] <= 'z'){
                lower++;
            }else if(chars[i] >= '0' && chars[i] <= '9'){
                digital++;
            }
        }
        return "upper letter: " + upper + "\nlower letter: " + lower + "\ndigital: " + digital;
    }
}
