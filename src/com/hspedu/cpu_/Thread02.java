package com.hspedu.cpu_;

public class Thread02 {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Thread thread = new Thread(dog);
//        thread.start();

        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();
    }
}

class Animal{

}

class Tiger extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("tiger bars");
    }
}

class Dog implements Runnable {
    int count = 0;
    @Override
    public void run() {
        while(true) {
            System.out.println("dog bar.. hi" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}


class ThreadProxy implements Runnable {
    private Runnable target = null;

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    @Override
    public void run() {
        if(target != null) {
            target.run();
        }
    }

    public void start() {
        start0();
    }

    public void start0() {
        run();
    }
}