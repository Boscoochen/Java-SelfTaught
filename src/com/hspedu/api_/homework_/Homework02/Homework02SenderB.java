package com.hspedu.api_.homework_.Homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);
        System.out.println("please enter: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        byte[] bytes = new byte[1024];
        bytes = input.getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,0, bytes.length, InetAddress.getLocalHost(), 9999);
        socket.send(packet);

        byte[] buff = new byte[1024];
        packet = new DatagramPacket(buff,buff.length);
        socket.receive(packet);

        int length = packet.getLength();
        bytes = packet.getData();
        String s = new String(bytes, 0, length);
        System.out.println(s);


        socket.close();
        System.out.println("b quit");
    }
}
