package com.hspedu.cpu_.homework_;

import java.util.Locale;
import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}


class A extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((int)(Math.random() * 100 + 1));

        }
    }
}

class B extends Thread {
    private A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("enter Q to Quit");
            Scanner scanner = new Scanner(System.in);
            String c = scanner.next();
            if(c.equals("Q")){
                a.setLoop(false);
                break;
            }
        }

    }
}