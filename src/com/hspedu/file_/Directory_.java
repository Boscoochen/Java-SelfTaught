package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "/Applications/news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("successful delete");
            }
        }else {
            System.out.println("this file not exists");
        }
    }


    @Test
    public void m2() {
        String filePath = "/Applications/news2.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("successful delete");
            }
        }else {
            System.out.println("this file not exists");
        }
    }

    @Test
    public void m3() {
        String directiryPath = "/Applications/text01";
        File file = new File(directiryPath);
        if(file.exists()){
            System.out.println("directiryPath exist");
        }else {
            if(file.mkdirs()){
                System.out.println(directiryPath + "success");
            }else {
                System.out.println("fail");
            }
        }

    }
}
