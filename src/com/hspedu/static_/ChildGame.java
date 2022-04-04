package com.hspedu.static_;

import java.awt.*;

public class ChildGame {
    public static void main(String[] args) {

        Child baigujing = new Child("baigujing");
        baigujing.join();
        Child.count++;
        Child hulijing = new Child("hulijing");
        hulijing.join();
        Child.count++;
        Child laoshujing = new Child("laoshujing");
        laoshujing.join();
        Child.count++;

        System.out.println("Total children " + Child.count + " joined the game");
    }
}


class Child {
    private String name;
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }


    public void join() {
        System.out.println( name + "joined the game..");
    }


}