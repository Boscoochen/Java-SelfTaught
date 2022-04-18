package com.hspedu.file_.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String filePath = "/Applications/hello.txt";
        FileInputStream fileInputStream = null;
        int readData = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while((readData = fileInputStream.read()) != -1){
                System.out.print((char)readData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void readFile02() {
        String filePath = "/Applications/hello.txt";
        byte[] buff = new byte[8];
        FileInputStream fileInputStream = null;
        int readData = 0;
        int readlen = 0;
        try {
            fileInputStream = new FileInputStream(filePath);
            while((readlen = fileInputStream.read(buff)) != -1){
                System.out.print(new String(buff, 0, readlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
