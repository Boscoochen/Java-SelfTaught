package com.hspedu.file_.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "/Applications/ok.txt";
        String destFilePath = "/Applications/ok2.txt";
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter((new FileWriter(destFilePath)));
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
