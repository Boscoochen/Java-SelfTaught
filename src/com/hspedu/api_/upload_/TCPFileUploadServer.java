package com.hspedu.api_.upload_;

import com.hspedu.api_.homework_.homework03.StreamUtils;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket servrSocket = new ServerSocket(8888);
        System.out.println("server at 8888 port listening");
        Socket socket = servrSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        String destFilePath = "src/google.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFilePath));
        bos.write(bytes);

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("server receive picture");
        writer.flush();
        socket.shutdownOutput();

        bos.close();
        bis.close();
        socket.close();
        servrSocket.close();
        writer.close();

    }

}
