package com.hspedu.api_.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) {
        Socket accept = null;
        ServerSocket serverSocket = null;
        OutputStream outputStream = null;
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
            byte[] buff = new byte[1024];
            int readln = 0;
            while ((readln = inputStream.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readln));
            }
            outputStream = accept.getOutputStream();
            outputStream.write("hello, client".getBytes());
            accept.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                accept.close();
                serverSocket.close();
                outputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(accept);
    }
}
