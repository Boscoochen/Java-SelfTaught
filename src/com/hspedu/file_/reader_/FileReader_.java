package com.hspedu.file_.reader_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

        String filePath = "/Applications/story.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            while ((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void fileReader02 () {
        String filePath = "/Applications/story.txt";
        FileReader fileReader = null;
        int readlen = 0;
        char[] buff = new char[8];
        try {
            fileReader = new FileReader(filePath);
            while ((readlen = fileReader.read(buff)) != -1){
                System.out.print(new String(buff, 0, readlen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
