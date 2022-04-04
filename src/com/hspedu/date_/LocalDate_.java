package com.hspedu.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime idt = LocalDateTime.now();
        System.out.println(idt);
//        System.out.println(idt.getYear());
//        System.out.println(idt.getMonth());
//        System.out.println(idt.getMonthValue());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String strDate = dtf.format(idt);
        System.out.println(strDate);
    }
}
