package com.hspedu.date_;
import java.util.Calendar;
public class Calendar_ {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
    }
}
