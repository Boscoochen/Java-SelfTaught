package com.hspedu.api_.homework_.homework01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;

public class Homework01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("Client soclet return=" + socket.getClass());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("name");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedWriter.write("hobby");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        s = bufferedReader.readLine();
        System.out.println(s);



        bufferedReader.close();
        socket.close();
        bufferedWriter.close();
    }
}
