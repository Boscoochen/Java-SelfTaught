package com.hspedu.wrapper_;

import java.util.Arrays;

public class Homework01 {
    public static void main(String[] args) {

//        String str = "abcdef";
//        StringBuffer stringbuffer1 = new StringBuffer(str);
//        StringBuffer stringbuffer2 = new StringBuffer("bcde");
//        int firstChar = 0;
//        int lastChar = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == stringbuffer2.charAt(0)){
//                firstChar = i;
//            }
//            if(str.charAt(i) == stringbuffer2.charAt(stringbuffer2.length() - 1)) {
//                lastChar = i;
//            }
//
//        }
//        StringBuffer reverse = stringbuffer2.reverse();
//        System.out.println(firstChar + " " + lastChar);
//        stringbuffer1 = stringbuffer1.replace(firstChar, lastChar+1, reverse.toString());
//        System.out.println(stringbuffer1);

        String str = "abcdef";

        String str2 = null;
        try {
            str2 = reverse(null, 1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(str2);
    }

    public static String reverse(String str, int start, int end) {
        if(!(str != null && start < end && start >= 0 && end < str.length())){
            throw new RuntimeException("wrong parameter");
        }
        char[] chars = str.toCharArray();
        char temp;
        for(int i = start, j = end; i < j; i++, j--){
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
