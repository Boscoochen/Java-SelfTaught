package com.hspedu;

public class quiz {
    public static void main(String[] args) {

    }
}

class DVD extends Item implements Item2, Item3{

    public String viewTrailer() {
        String name = super.name;
        return name;
    }
}

class Item {
    public String name;
}

interface Item2 {

}
interface Item3 {

}