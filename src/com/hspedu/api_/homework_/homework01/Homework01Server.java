package com.hspedu.api_.homework_.homework01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server port 9999 is listening...");
        Socket socket = serverSocket.accept();
        System.out.println("Server socket=" + socket.getClass());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("i'm nova");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        s = bufferedReader.readLine();
        System.out.println(s);


        bufferedWriter.write("coding java program");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedReader.close();
        socket.close();
        serverSocket.close();
        bufferedWriter.close();

    }
}
