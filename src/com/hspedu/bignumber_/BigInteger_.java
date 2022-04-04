package com.hspedu.bignumber_;
import java.math.BigInteger;
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2348888888888999999999999999999999999999999");
        BigInteger bigInteger1 = new BigInteger("100");
        BigInteger add = bigInteger.add(bigInteger);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
    }
}
