package com.hspedu.transformation_;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReader_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/ok.txt";
        InputStreamReader gbk = new InputStreamReader(new FileInputStream(filePath), "utf-8");
        BufferedReader bufferedReader = new BufferedReader(gbk);
        String s = bufferedReader.readLine();
        System.out.println(s);
        gbk.close();
    }
}
