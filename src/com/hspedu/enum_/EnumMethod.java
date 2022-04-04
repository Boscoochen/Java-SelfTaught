package com.hspedu.enum_;

public class EnumMethod {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        Season winter = Season.WINTER;
        System.out.println(autumn.name());
        System.out.println(winter.ordinal());
        System.out.println(autumn.ordinal());
        Season[] values = Season.values();
        for(Season season : values){
            System.out.println(season);
        }
        System.out.println(values.length);

        Season autumn1 = Season.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);

        System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));

    }
}
