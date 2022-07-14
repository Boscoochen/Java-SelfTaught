package com2.hspjy.chapter17_Thread.threaduse.method;

public class ThreadMethod03 {
    public static void main(String[] args) {

    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for ( ;; ) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }
}
