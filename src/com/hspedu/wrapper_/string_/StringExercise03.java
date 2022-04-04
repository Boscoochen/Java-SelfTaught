package com.hspedu.wrapper_.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b)); //true
        System.out.println(a==b); //false
        System.out.println(a==b.intern()); //true
        System.out.println(b==b.intern()); //false
    }
}
