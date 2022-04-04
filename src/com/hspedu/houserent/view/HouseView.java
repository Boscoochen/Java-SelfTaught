package com.hspedu.houserent.view;


import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.utils.Utility;
import com.hspedu.houserent.service.HouseService;

/**
 * 1. display menu
 * 2. receive user inputs
 * 3. call HouseService to complete all operation of house info
 */
public class HouseView {
    private boolean loop = true; //control displaying menu
    private char key = ' '; //receive user select
    private HouseService houseService = new HouseService(2);//set array size 10
    //1. display menu

    public void listHouse() {
        System.out.println("-------------House lists--------------");
        System.out.println("Id\t\tName\t\tPhone\t\tAddress\t\tRent\t\tState(Rented/NotRented)");
        House[] houses = houseService.list();

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                continue;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-------------House lists displayed--------------");
    }

    public void addHouse() {
        System.out.println("-------------Add House Info--------------");
        System.out.println("Name: ");
        String name = Utility.readString(20);
        System.out.println("Phone: ");
        String phone = Utility.readString(12);
        System.out.println("Address: ");
        String address = Utility.readString(50);
        System.out.println("Monthly Rent: ");
        int rent = Utility.readInt();
        System.out.println("State: ");
        String state = Utility.readString(10);
        House newHouse = new House(0, name, phone, address, rent, state);

        if (houseService.add(newHouse)) {
            System.out.println("-------------Add House Info successful--------------");
        } else {
            System.out.println("-------------Add House Info failed--------------");
        }
    }


    public void delHouse() {
        System.out.println("-------------Delete A House Info--------------");
        System.out.println("Please Enter Delete House ID(-1Exit):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("--------------Give Up Deleting A House Info--------------");
            return;
        }

        char choice = Utility.readConfirmSelection(); //have to enter Y or N
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("-------------Delete House Info successful--------------");
            } else {
                System.out.println("-------------Delete House Info failed--------------");
            }
        } else {
            System.out.println("--------------Give Up Deleting A House Info--------------");
        }

    }

    public void findHouse() {
        System.out.println("-------------Find A House Info--------------");
        System.out.println("Please Enter your Find House Id: ");
        int findId = Utility.readInt();
        House house = houseService.findbById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("-------------Find Id not exist--------------");

        }
    }

    public void updatesHouse() {
        System.out.println("-------------Updates A House Info--------------");
        System.out.println("Please Enter your Update House Id(-1Exit):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("-------------You Give Up Updating A House Info--------------");
            return;
        }

        House house = houseService.findbById(updateId);
        if (house == null) {
            System.out.println("-------------Update House Id Not Exist--------------");
            return;
        }

        System.out.println("Name(" + house.getName() + "): ");
        String name = Utility.readString(30, "");
        if (!"".equals(name)) {
            house.setName(name);
        }


        System.out.println("Phone(" + house.getPhone() + "): ");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("Address(" + house.getAddress() + "): ");
        String address = Utility.readString(50, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("MonthlyRent(" + house.getRent() + "): ");
        int MonthlyRent = Utility.readInt(-1);
        if (MonthlyRent != -1) {
            house.setRent(MonthlyRent);
        }

        System.out.println("State(" + house.getState() + "): ");
        String state = Utility.readString(10, "");
        if (!"".equals(state)) {
            house.setState(state);
        }

        System.out.println("-------------Update House Info Successful--------------");

    }

    public void Quit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void mainMenu() {

        do {
            System.out.println("\n-------------House Renting System--------------");
            System.out.println("\t\t\t1 Add House Info");
            System.out.println("\t\t\t2 Find A House");
            System.out.println("\t\t\t3 Delete A House Info");
            System.out.println("\t\t\t4 Updates A House Info");
            System.out.println("\t\t\t5 Display House List");
            System.out.println("\t\t\t6 Exit");

            System.out.println("Please Enter Your choice(1-6): ");

            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
//                    System.out.println("3 Delete A House Info");
                    delHouse();
                    break;
                case '4':
//                    System.out.println("4 Updates A House Info");
                    updatesHouse();
                    break;
                case '5':
//                    System.out.println("5 Display House List");
                    listHouse();
                    break;
                case '6':
                    Quit();
                    break;
                default:
                    System.out.println("Something gets wrong");
                    break;
            }


        } while (loop);
    }
}
