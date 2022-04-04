package com.hspedu.wrapper_;

import javax.lang.model.type.IntersectionType;

public class WrapperVSString {
    public static void main(String[] args) {
        Integer i = 100;
        String str1 = i + "";
//        String s = i.toString();
        String.valueOf(i);
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);
        Integer integer = new Integer(str4);
    }
}
