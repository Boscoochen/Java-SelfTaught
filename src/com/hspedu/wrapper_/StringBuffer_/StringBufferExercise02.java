package com.hspedu.wrapper_.StringBuffer_;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.println("商品\t\t商品价格");
        Scanner scanner = new Scanner(System.in);
        String name;
        String price;
        name = scanner.next();
        price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        int index= stringBuffer.lastIndexOf(".");
        for(int i = index - 3; i > 0; i -= 3){
            stringBuffer = stringBuffer.insert(i, ",");
        }
//        int index = stringBuffer.lastIndexOf(".");
//        if(index - 3 != 0){
//            stringBuffer = stringBuffer.insert(index - 3, ",");
//        }
//
//
//        while(true){
//            int index2 = stringBuffer.indexOf(",");
//            if(index2 - 3 <= 0){
//                break;
//            }
//            stringBuffer = stringBuffer.insert(index2 - 3, ",");
//
//        }


        System.out.println(stringBuffer);
    }
}
