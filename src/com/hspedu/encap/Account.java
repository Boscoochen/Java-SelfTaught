package com.hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("name need to be 2-4 characters, default name: no_one");
            this.name = "no_one";
        }

    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("balance has to(>20) default: 0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("password need to be 6 characters, default password: 000000");
            this.pwd = "000000";
        }

    }

    public void showInfo() {

        System.out.println("accountinfo name=" + name + " balance=" + balance + " password=" + pwd);
    }
}


