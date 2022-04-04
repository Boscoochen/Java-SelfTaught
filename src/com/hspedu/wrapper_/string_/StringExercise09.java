package com.hspedu.wrapper_.string_;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s5 = "hspedujava";
        String s6 = (s1 + s2).intern();
        System.out.println(s5 == s6); // true
        System.out.println(s5.equals(s6)); //true

    }
}
