package com.hspedu.enum_.homework_;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());
    }
}

class Frock {
    //initialize currentNum to 100000, make it static int
    private static int currentNum = 100000;
    //define serialNumber, make it static int, default is 0
    private static int serialNumber;

    //empty parameter constructor, give value getNextNum() to serialNumber
    public Frock() {
        serialNumber = getNextNum();
    }
    //method getNextNum(), currentNum self increase 100 each time
    public static int getNextNum() {
        return currentNum += 100;
    }


    //getSerialNumber() method return serialNumber
    public int getSerialNumber(){
        return serialNumber;
    }
}
