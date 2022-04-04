package com.hspedu.wrapper_;

public class Homework03 {
    public static void main(String[] args) {
        String name = "Han Shun Ping";
        System.out.println(printName(name));
    }

    //    public static StringBuffer printName(String name) {
//        String[] names = name.split(" ");
//        return new StringBuffer().append(names[2] + "," + names[0] + " ." + names[1].charAt(0));
//    }
    public static String printName(String name) {
        String[] names = name.split(" ");
        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        return format;
    }
}
