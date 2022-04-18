package com.hspedu.api_.udp_;

import java.io.IOException;
import java.net.*;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] bytes = "hello, tmr eat hot pot".getBytes();
//        System.out.println(InetAddress.getLocalHost());
        DatagramPacket packet =
                new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 9999);
        socket.send(packet);

        byte[] buff = new byte[64 * 1024];
        packet = new DatagramPacket(buff, buff.length);
        System.out.println("B waiting receive data");
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data = packet.getData();

        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("B closed");

    }
}
