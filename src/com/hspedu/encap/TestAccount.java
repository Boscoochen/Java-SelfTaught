package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jacksmith");
        account.setBalance(6);
        account.setPwd("33");

        account.showInfo();
    }
}
