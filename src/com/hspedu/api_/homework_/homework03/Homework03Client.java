package com.hspedu.api_.homework_.homework03;

import com.hspedu.api_.homework_.homework01.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //1 接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter file name:");
        String downLoadFileName = scanner.next();

        //2. 客户端连接服务器， 准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downLoadFileName.getBytes());
        //3. 设置写入结束的标志
        socket.shutdownOutput();

        //4 读取服务端返回的文件（字节数据）
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //5 得到一个输出流， 准备将bytes 写入到磁盘文件
        String filePath = "/Applications/" + downLoadFileName + ".mp4";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("download success");
    }
}
