package com.hspedu.enum_;



public class EnumExercise02 {
    public static void main(String[] args) {
        System.out.println("===All Days info===");
        Day[] days = Day.values();
        for(Day day : days) {
            System.out.println(day);
        }
    }
}


enum Day {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private final String day;
    private Day(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day;
    }
}


@Deprecated
interface B {
    public void play();
}

enum A implements B{
    MUSIC; // oject same as A MUSIC = new A();


    @Override
    public void play() {

    }
}

