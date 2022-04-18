package com.hspedu.api_.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTCP01Client {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("client socket return " + socket.getClass());
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
            outputStream.write("hello, server".getBytes());
            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            byte[] buff = new byte[1024];
            int readln = 0;
            while ((readln = inputStream.read(buff)) != -1) {
                System.out.println(new String(buff, 0, readln));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                socket.close();
                inputStream.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
