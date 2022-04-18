package com.hspedu.cpu_;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();
        System.out.println("main thread continue exacute" + Thread.currentThread().getName());
        for (int i = 0; i < 60; i++) {
            System.out.println("main thread i=" + i);
            Thread.sleep(1000);
        }
    }
}

@SuppressWarnings({"all"})
class Cat extends Thread{
    int times = 0;
    @Override
    public void run() {

        while (true){
            System.out.println("喵喵，我是小猫咪 " + ++times + " 线程名称" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(times == 80){
                break;
            }
        }

    }
}