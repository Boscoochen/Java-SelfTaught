package com.hspedu.houserent.service;


import com.hspedu.houserent.domain.House;

/**
 * HouseService.java class
 * Define House[], store House object
 * 1. Respond HouseView call
 * 2. complete operation of house info crud
 */
public class HouseService {
    private int houseNums = 1;
    private int idCounter = 1;
    private House[] houses; //store House object

    public HouseService(int size) {
        //new Houses;
        houses = new House[size]; //when create HouseService object, assign array size
        houses[0] = new House(1, "jack", "112",
                "12e434 silly point lane", 2000, "Not Rented");
    }

    public House[] list() {
        return houses;
    }


    public boolean add(House newHouse) {
        if (houseNums == houses.length) { //array full
            System.out.println("Array full, can not add...");
            return false;
        }

        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
//        if(houseNums == 0){
//            System.out.println("Array empty, can not delete...");
//        }
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return false;
        }

//        House[] newArr = new House[2];
//        int j = 0;
//        for (int i = 0; i < houseNums; i++) {
//            if(i == index){
//                continue;
//            }
//            newArr[j++] = houses[i];
//        }
//        houseNums--;
//        houses = newArr;
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;

    }

    public House findbById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

}
