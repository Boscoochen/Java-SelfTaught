package com.hspedu.api_.socket;

import com.hspedu.transformation_.OutPutStreamWriter_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP03Client {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("client socket return " + socket.getClass());
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
//            outputStream.write("hello, server".getBytes());
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("hello, server character stream");
            bufferedWriter.newLine();
            bufferedWriter.flush();
//            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s = bufferedReader.readLine();
            System.out.println(s);
//            byte[] buff = new byte[1024];
//            int readln = 0;
//            while ((readln = inputStream.read(buff)) != -1) {
//                System.out.println(new String(buff, 0, readln));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                outputStream.close();
                bufferedReader.close();
                bufferedWriter.close();

                socket.close();
//                inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
