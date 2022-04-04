package com.hspedu.smallchange_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "-----------------------ChangeDetails-------------------------";
        double money = 0;
        double balance = 0;
        Date date = null; // date is java.util.Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String note = "";
        do {
            System.out.println("\n===============ChangeMenu===============");
            System.out.println("\t\t\t1 ChangeDetails");
            System.out.println("\t\t\t2 Deposit");
            System.out.println("\t\t\t3 Spend");
            System.out.println("\t\t\t4 Quit");
            System.out.println("Please select (1-4) ");
            key = scanner.next();

            switch (key) {
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.println("Deposit among:");
                    money = scanner.nextDouble();
                    // money range verify
                    if(money <= 0) {
                        System.out.println("Deposit among need to be ( >0 )");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\nIncome deposit\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    System.out.println(details);
                    break;
                case "3" :
                    System.out.println("Spend amount:");
                    money = scanner.nextDouble();
                    if(money > balance || money <= 0) {
                        System.out.println("spend among need to be 0-" + balance);
                        break;
                    }
                    System.out.println("Spend Details:");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    System.out.println(details);
                    break;
                case "4" :
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

                    break;
                default:
                    System.out.println("Select wrong");
                    break;
            }



        } while(loop);

        System.out.println("---------You quit smallchange system-------");
    }
}
