package com2.hspjy.chapter17_Thread.threaduse;

public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("喵喵， 我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8) {
                break;
            }
        }
    }
}
