package com.hspedu.wrapper_.StringBuilder;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            buffer.append(String.valueOf(i));
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer run time: " + (endTime - startTime));
        startTime =  System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append(String.valueOf(i));
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder runtime: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            text += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String runtime: " + (endTime - startTime));

    }
}
