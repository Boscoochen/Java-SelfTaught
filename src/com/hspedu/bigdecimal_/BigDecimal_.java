package com.hspedu.bigdecimal_;
import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.11111111111111111111111111111111111111111111111111111111111111111111111111");
        double d = 1999.11111111111111111111111111111111111111111111111111111111111111111111111111d;
        System.out.println(d);
        System.out.println(bigDecimal);
        BigDecimal bigDecimal1 = new BigDecimal("3.034235436");
        BigDecimal divide = bigDecimal.divide(bigDecimal1, BigDecimal.ROUND_CEILING);
        System.out.println(divide);
    }
}
