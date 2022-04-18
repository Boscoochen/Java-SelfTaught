package com.hspedu.cpu_.homework_;

import com.hspedu.poly_.Polyarr_.Person;

public class Homework02 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("smith");
        new Thread(p1).start();
        new Thread(p1).start();
    }
}



class Person1 implements Runnable {
    private String name;
    private double total = 10000;

    public Person1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (total < 1000) {
                    System.out.println("余额不足。。");
                    break;
                }
                total -= 1000;
                System.out.println(Thread.currentThread().getName() + " 余额： " + total);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

//    public synchronized void withDrawMoney() {
//        run();
//    }
}


