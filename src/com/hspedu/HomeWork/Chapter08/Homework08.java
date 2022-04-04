package com.hspedu.HomeWork.Chapter08;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);
//        checkingAccount.withdraw(9);
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());

        savingsAccount.earnMonthlyInterest();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.withdraw(100);
        System.out.println(savingsAccount.getBalance());

    }
}


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class CheckingAccount extends BankAccount {

    public CheckingAccount(double balance) {
        super(balance);
    }

    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}


class SavingsAccount extends BankAccount {
    //any attributes?
    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void deposit(double amount) {
        if(count > 0){
            super.deposit(amount);
        }else{
            super.deposit(amount - 1);
        }
        count--;
    }


    @Override
    public void withdraw(double amount) {
        if(count > 0){
            super.withdraw(amount);
        }else{
            super.withdraw(amount + 1);
        }
        count--;
    }

    public void earnMonthlyInterest() { //every month, calculate interest, reset count
        count = 3;
        super.deposit(getBalance() * rate);
    }
}