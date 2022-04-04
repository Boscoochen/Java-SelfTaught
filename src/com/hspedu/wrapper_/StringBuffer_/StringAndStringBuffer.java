package com.hspedu.wrapper_.StringBuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println(stringBuffer1);

        StringBuffer stringBuffer2 = new StringBuffer("abc");
        String s = stringBuffer2.toString();
        String s1 = new String(stringBuffer2);

    }
}
