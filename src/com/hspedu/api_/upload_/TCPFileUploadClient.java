package com.hspedu.api_.upload_;



import com.hspedu.api_.homework_.homework03.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String filePath = "/Applications/test1.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        byte[] bytes = StreamUtils.streamToByteArray(bis);

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);
        bis.close();
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        inputStream.close();
        bos.close();
        socket.close();

    }
}
