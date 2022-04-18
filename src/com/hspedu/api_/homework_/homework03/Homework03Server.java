package com.hspedu.api_.homework_.homework03;


import com.hspedu.api_.homework_.homework01.StreamUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //1 监听 9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        //2 等待客户端连接
        System.out.println("server is listening...");
        Socket socket = serverSocket.accept();
        //3 读取客户端发送下载的文件名
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStream.read(b)) != -1) {
            downLoadFileName += new String(b, 0, len);
        }
        System.out.println("file name the Client need to download: " + downLoadFileName);

        //
        String resFileName = "";
        if ("高山流水".equals(downLoadFileName)) {
            resFileName = "src/高山流水.mp4";
        } else {
            resFileName = "src/无名.mp4";
        }

        //包装流写出文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        socket.shutdownOutput();
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        bos.close();
    }
}
