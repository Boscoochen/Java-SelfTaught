package com.hspedu.properties_;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
//        properties.load(new FileReader("src/com/hspedu/properties_/mysql.properties"));
        properties.setProperty("charset", "utf8");
//        properties.setProperty("user", "tom");
        properties.setProperty("pwd", "abc111");
        properties.setProperty("user", "smith");

        properties.store(new FileOutputStream("src/com/hspedu/properties_/mysql2.properties"), null);
        System.out.println("store complete");
    }
}
