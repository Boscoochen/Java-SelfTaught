package com.hspedu.file_.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "/Applications/note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('a');
            fileWriter.write(chars);
            fileWriter.write("韩顺平校验".toCharArray(), 0, 3);
            fileWriter.write(" 你好北京～");
            fileWriter.write("上海天津", 0, 2);

            System.out.println("file created");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
