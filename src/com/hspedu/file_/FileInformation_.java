package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation_ {
    public static void main(String[] args) {

    }


    @Test
    public void info() {
        File file = new File("/Applications/news1.txt");
        System.out.println("file name=" + file.getName());
        System.out.println("file absoultly path=" + file.getAbsolutePath());
        System.out.println("file super path=" + file.getParent());
        System.out.println("file size=" + file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
