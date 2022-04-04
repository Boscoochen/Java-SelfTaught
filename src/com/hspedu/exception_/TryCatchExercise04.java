package com.hspedu.exception_;

import java.util.Scanner;

public class TryCatchExercise04 {

    public static void main(String[] args) {

        do {
            System.out.println("Please enter a integer: ");
            Scanner myscanner = new Scanner(System.in);
            try{
                myscanner.nextInt();
                System.out.println("good job");
                break;
            }catch (Exception e) {
                System.out.println("Wrong input type, Try Again!!");
            }
        }while(true);
    }
}
