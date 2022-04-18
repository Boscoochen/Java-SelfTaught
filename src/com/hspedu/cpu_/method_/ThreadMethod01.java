package com.hspedu.cpu_.method_;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("hsp");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        for (int i = 0; i < 5 ; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t.getName() + " " + t.getPriority());
        t.interrupt();
    }
}


class T extends Thread{
    @Override
    public void run() {
        int count = 0;
        while (true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " eat bread~~~~" + (++count));
            }
            try {
                System.out.println(Thread.currentThread().getName() + " sleep~~~~");
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " is interrupted");
            }
        }

    }
}
