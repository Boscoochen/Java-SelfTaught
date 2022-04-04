package com.hspedu.list_;

import java.util.LinkedList;

public class LinkedList_ {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("hsp");
        jack.next = tom;
        tom.next = hsp;

        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack;
        Node last = hsp;

        while (true) {
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("=========");
        while (true) {
            if(last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


        Node smith = new Node("smith");
        tom.next = smith;
        smith.pre = tom;
        smith.next = hsp;
        hsp.pre = smith;
        System.out.println("=======");
        first = jack;
        while (true) {
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

    }
}


class Node {
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name) {
        this.item = name;
    }

    public String toString() {
        return "Node name=" + item;
    }


}
