package com.hspedu.houserent;

import com.hspedu.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //create HouseView object, display menu, program interface
        new HouseView().mainMenu();
        System.out.println("===You exit HouseRent System===");
    }
}
