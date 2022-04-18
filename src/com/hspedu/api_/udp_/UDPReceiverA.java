package com.hspedu.api_.udp_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buff = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        System.out.println("receiver waiting receive data");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();

        String s = new String(data, 0, length);
        System.out.println(s);

        byte[] bytes = "ok, see you tmr".getBytes();
        packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getByName("127.0.0.1"), 9998);
        socket.send(packet);

        socket.close();
        System.out.println("A closed");

    }
}
