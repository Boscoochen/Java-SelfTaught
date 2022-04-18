package com.hspedu.api_.homework_.Homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Homework02ReceiveA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        System.out.println("A is listening..");
        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        if("sidamingzhu".equals(s)){
            bytes = "hongloumeng".getBytes();
            packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 9998);
            socket.send(packet);
        }else {
            bytes = "what?".getBytes();
            packet = new DatagramPacket(bytes, 0, bytes.length, InetAddress.getLocalHost(), 9998);
            socket.send(packet);
        }

        socket.close();
    }
}
