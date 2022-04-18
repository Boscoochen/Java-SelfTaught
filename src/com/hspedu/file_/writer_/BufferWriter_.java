package com.hspedu.file_.writer_;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriter_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write("'hello, hsp!\n");
        bufferedWriter.write("'hello, hsp!\n");
        bufferedWriter.close();

    }
}
