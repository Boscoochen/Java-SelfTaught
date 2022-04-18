package com.hspedu.file_.ouputstream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "/Applications/text01/a.jpeg";
        String destFilePath = "/Applications/text02/a02.jpeg";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath, true);

            byte[] buff = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buff)) != -1) {
                fileOutputStream.write(buff, 0, readlen);
            }
            System.out.println("copy success");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
