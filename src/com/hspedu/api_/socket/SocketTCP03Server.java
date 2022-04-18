package com.hspedu.api_.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP03Server {
    public static void main(String[] args) {
        Socket accept = null;
        ServerSocket serverSocket = null;
        OutputStream outputStream = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("server waiting connect..");
            accept = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream inputStream = null;
        try {
            inputStream = accept.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s = bufferedReader.readLine();
            System.out.println(s);


            outputStream = accept.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("hello, client, character stream");
            bufferedWriter.newLine();
            bufferedWriter.flush();
//            outputStream.write("hello, client".getBytes());
//            accept.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
//                inputStream.close();
                bufferedReader.close();
                accept.close();
                serverSocket.close();
//                outputStream.close();
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(accept);
    }
}
