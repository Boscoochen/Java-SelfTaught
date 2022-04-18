package com.hspedu.properties_.homework_;

import java.io.BufferedReader;
import java.io.FileReader;

public class Homework02 {
    public static void main(String[] args) throws Exception{
        String filePath = "/Applications/story.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(++i + " " + line);
        }

        bufferedReader.close();
    }
}
