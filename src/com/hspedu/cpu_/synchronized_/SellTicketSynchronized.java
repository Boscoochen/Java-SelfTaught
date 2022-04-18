package com.hspedu.cpu_.synchronized_;

public class SellTicketSynchronized {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();




    }
}

class A{

}

class SellTicket03 implements Runnable {
    private int ticketNum = 1000;
    private boolean loop = true;

    public synchronized static void m1() {

    }

    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }


    //different object can pass in synchronized block, as long as this object is in SellTicket03 object
//    A a = new A();
//    Object object = new Object();

    public /*synchronized*/ void sell() {
        synchronized (this) {
            if (ticketNum <= 0) {
                System.out.println("sold out~");
                loop = false;
                return;
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("window " + Thread.currentThread().getName() + " sold 1 ticket" +
                    " left ticket " + (--ticketNum));
        }
    }

    @Override
    public void run() {
        while(loop) {
            sell();
        }
    }
}
class SellTicket01 extends Thread {
    private static int ticketNum = 100;
    @Override
    public void run() {
        while(true) {
            if(ticketNum <= 0) {
                System.out.println("sold out~");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("window " + Thread.currentThread().getName() + " sold 1 ticket" +
                    " left ticket " + (--ticketNum));
        }
    }
}


class SellTicket02 implements Runnable {
    private int ticketNum = 100;
    @Override
    public void run() {
        while(true) {
            if(ticketNum <= 0) {
                System.out.println("sold out~");
                break;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("window " + Thread.currentThread().getName() + " sold 1 ticket" +
                    " left ticket " + (--ticketNum));
        }
    }
}
