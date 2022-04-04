package com.hspedu.wrapper_;

public class Homework02 {
    public static void main(String[] args) {
        String username = "null";
        String password = "123456";
        String email = "@.";

        try {
            Homework02.Create(username, password, email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Create(String username, String password, String email) {
        //verify username
        if(!(username != null && password != null && email != null)){
            throw new RuntimeException("parameter can not be null");
        }
        if(!(username.length() >= 2 && username.length() <= 4)){
            throw new RuntimeException("username length need to be(2-4)");
        }else{
            System.out.println("username correct: " + username);
        }

        //verify password
//        try {
//            int numpassword = Integer.parseInt(password.toString());
        if(!(password.length() == 6 && isDigital(password))){
            throw new RuntimeException("password length need to be 6 and all digitals");
        }else {
            System.out.println("password correct: " + password);
        }
//        } catch (NumberFormatException e) {
//            System.out.println("password need to be all numbers");
//        }

        //verify email
        System.out.println(email.indexOf("@"));
        System.out.println(email.indexOf("."));
        if(!(email.indexOf("@") < email.indexOf(".") && email.indexOf("@") != -1 && email.indexOf(".") != -1))  {
            throw new RuntimeException("email format not correct");
        }else {
            System.out.println("email correct: " + email);
        }

    }

    public static boolean isDigital(String arr) {
        char[] chars = arr.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }
        }

        return true;
    }
}


