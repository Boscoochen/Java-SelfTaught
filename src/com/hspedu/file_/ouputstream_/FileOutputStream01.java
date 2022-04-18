package com.hspedu.file_.ouputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        String filePath = "/Applications/a.txt";
        FileOutputStream fileOutputStream = null;

        try {
//            fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath, true);
            String str = "hsp, world";
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
