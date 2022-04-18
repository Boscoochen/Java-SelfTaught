package com.hspedu.cpu_.synchronized_;

public class DeadLock_ {
    public static void main(String[] args) {
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.setName("Thread A ");
        A.start();
        B.setName("Thread B ");
        B.start();
    }
}



class DeadLockDemo extends Thread {
    static Object o1 = new Object();
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag) {
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "into1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "into2");
                }
            }
        }else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "into3");
                synchronized (o1) {
                    System.out.println(Thread.currentThread().getName() + "into4");
                }
            }
        }
    }
}