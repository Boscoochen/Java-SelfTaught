package com.hspedu.cpu_.exit_;

public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}


class T extends Thread {
    private int count = 0;
    private Boolean loop = true;

    public Boolean getLoop() {
        return loop;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T running..." + (++count));

        }

    }
}