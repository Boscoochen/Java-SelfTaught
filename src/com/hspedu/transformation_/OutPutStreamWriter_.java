package com.hspedu.transformation_;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutPutStreamWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/text05.txt";
        OutputStreamWriter utf8 = new OutputStreamWriter(new FileOutputStream(filePath), "utf8");
        utf8.write("hi, 韩顺平校验");
        utf8.close();
    }
}
