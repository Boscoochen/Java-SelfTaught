package com2.hspjy.chapter17_Thread.threaduse.exit_;

public class ThreadExit_ {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.setLoop(false);
    }
}

class T extends Thread {
    private int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T 运行中。。。" + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}