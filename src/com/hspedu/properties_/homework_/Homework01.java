package com.hspedu.properties_.homework_;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

public class Homework01 {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/story3.txt";
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("file is exist");
        }else{
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("hello,world~");
            fileWriter.close();
            System.out.println("file created");
        }
    }
}
