package com.hspedu.date_;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Date_ {


    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);

        Date d2 = new Date(9234567);
        System.out.println(d2);
        String s = "2022年03月29日 12:20:57 Tue";
        Date parse = sdf.parse(s);
        System.out.println(parse);
    }
}
