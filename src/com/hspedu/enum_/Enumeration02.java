//package com.hspedu.enum_;
//
//public class Enumeration02 {
//    public static void main(String[] args) {
//
//        System.out.println(Season.AUTUMN);
//        System.out.println(Season.SPRING);
//        System.out.println(Season.SUMMER);
//        System.out.println(Season.WINTER);
//    }
//}
//
//
//class Season {
//    private String name;
//    private String desc;
//
//    //define 4 objects
//    public final static Season SPRING = new Season("Spring", "warm");
//    public final static Season WINTER = new Season("Winter", "cold");
//    public final static Season AUTUMN = new Season("Autumn", "cool");
//    public final static Season SUMMER = new Season("Summer", "hot");
//
//
//    private Season(String name, String desc) {
//        this.name = name;
//        this.desc = desc;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    @Override
//    public String toString() {
//        return "Season{" +
//                "name='" + name + '\'' +
//                ", desc='" + desc + '\'' +
//                '}';
//    }
//}