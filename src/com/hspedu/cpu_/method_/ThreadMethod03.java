package com.hspedu.cpu_.method_;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("baoqiangzaixinkugongzuo..." + i);
            Thread.sleep(1000);
        }
    }
}



class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for( ;; ) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("marong he songzhe kuaile liaotian, hahahah");
        }
    }
}