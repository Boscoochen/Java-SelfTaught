package com.hspedu.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wukong = new LittleMonkey("Wukong");
        wukong.climbing();
        wukong.swimming();
        wukong.frying();
    }
}

interface Fish {
    void swimming();
}

interface Birdable{
    void frying();
}

class Monkey {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing() {
        System.out.println(name + " climbing");
    }
}


class LittleMonkey extends Monkey implements Fish, Birdable{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + " learn how to swim like fish swimming");
    }

    @Override
    public void frying() {
        System.out.println(getName() + " learn how to fry like bird frying");

    }
}