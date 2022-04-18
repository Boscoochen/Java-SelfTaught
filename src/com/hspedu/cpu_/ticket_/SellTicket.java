package com.hspedu.cpu_.ticket_;

public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();

        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();

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
