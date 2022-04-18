package com.hspedu.cpu_.exercise_;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        Thread thread = new Thread(t3);
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);

            if(i == 5) {
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束...");
    }
}


class T3 implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
                System.out.println("hello " + (++count));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                System.out.println("子线程结束...");
                break;
            }
        }
    }
}

