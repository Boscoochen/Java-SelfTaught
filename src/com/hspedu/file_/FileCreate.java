package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01() {
        String filePath = "/Applications/news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("file create successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create02() {
        File parentFile = new File("/Applications");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("file create successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void create03() {
        String parentPath = "/Applications/";
        String filePath = "news3.txt";
        File file = new File(parentPath, filePath);
        try {
            file.createNewFile();
            System.out.println("file create successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
