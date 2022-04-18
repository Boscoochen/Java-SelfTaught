package com.hspedu.cpu_.method_;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("main thread ate " + i + " bread");
            if (i == 5) {
                System.out.println("main thread let sub thread eat first");
                //t2.join();
                Thread.yield();
                System.out.println("sub thread finish eatingR");
            }
        }
    }
}


class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            System.out.println("sub thread ate " + i + " bread");
        }
    }
}