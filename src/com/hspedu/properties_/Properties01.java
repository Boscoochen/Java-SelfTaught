package com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileReader;

public class Properties01 {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/hspedu/properties_/mysql.properties"));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split("=");
            System.out.println(split[0] + " " + split[1]);
        }
        bufferedReader.close();
    }
}
