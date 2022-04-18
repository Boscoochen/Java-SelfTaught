package com.hspedu.transformation_;

import java.io.BufferedReader;
import java.io.FileReader;

public class CodeQuestion {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/ok.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = bufferedReader.readLine();
        System.out.println(line);
        bufferedReader.close();
    }
}
