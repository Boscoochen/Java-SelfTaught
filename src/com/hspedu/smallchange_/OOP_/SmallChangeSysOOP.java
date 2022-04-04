package com.hspedu.smallchange_.OOP_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SmallChangeSysOOP {


    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "-----------------------ChangeDetails-------------------------";
    double money = 0;
    double balance = 0;
    Date date = null; // date is java.util.Date
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String note = "";

    public void mainMenu(){
        do {
            System.out.println("\n===============ChangeMenu(OOP)===============");
            System.out.println("\t\t\t1 ChangeDetails");
            System.out.println("\t\t\t2 Deposit");
            System.out.println("\t\t\t3 Spend");
            System.out.println("\t\t\t4 Quit");
            System.out.println("Please select (1-4) ");
            key = scanner.next();

            switch (key) {
                case "1" :
                    this.detail();
                    break;
                case "2" :
                    this.income();
                    break;
                case "3" :
                    this.pay();
                    break;
                case "4" :
                    this.exit();

                    break;
                default:
                    System.out.println("Select wrong");
                    break;
            }



        } while(loop);
    }


    public void detail (){
        System.out.println(details);
    }

    public void income() {
        System.out.println("Deposit among:");


        try {
            money = scanner.nextDouble();
            // money range verify
            if (money <= 0) {
                System.out.println("Deposit among need to be ( >0 )");
                return;
            }
            balance += money;
            date = new Date();
            details += "\nIncome deposit\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
            System.out.println(details);
        }catch (InputMismatchException e) {
            System.out.println("Please enter correct amount");
            scanner.nextLine();
            return;
        }
    }

    public void pay() {
        System.out.println("Spend amount:");
        try {
            money = scanner.nextDouble();
            if (money > balance || money <= 0) {
                System.out.println("spend among need to be 0-" + balance);
                return;
            }
            System.out.println("Spend Details:");
            note = scanner.next();
            balance -= money;
            date = new Date();
            details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
            System.out.println(details);
        }catch (InputMismatchException e) {
            System.out.println("Please enter correct amount");
            scanner.nextLine();
            return;
        }
    }

    public void exit() {
        String choice = "";
        while(true){
            System.out.println("Are you sure to quit ? y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }

        if("y".equals(choice)){
            loop = false;
        }
    }
}
