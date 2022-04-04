package com.hspedu.HomeWork.Chapter08;

public class Homework04 {
    public static void main(String[] args) {
        NormalWorker smith = new NormalWorker("smith", 150, 28);
        manager jack = new manager("jack", 180, 20);
        smith.print();
        jack.print();
    }
}

class Worker {
    private String name;
    private double salaryPerDay;
    private int numOfDaysWork;

    public Worker(String name, double salaryPerDay, int numOfDaysWork) {
        this.name = name;
        this.salaryPerDay = salaryPerDay;
        this.numOfDaysWork = numOfDaysWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getNumOfDaysWork() {
        return numOfDaysWork;
    }

    public void setNumOfDaysWork(int numOfDaysWork) {
        this.numOfDaysWork = numOfDaysWork;
    }

    public void print() {

    }
}


class manager extends Worker {

    public manager(String name, double salaryPerDay, int numOfDaysWork) {
        super(name, salaryPerDay, numOfDaysWork);
    }

    public void print() {
        System.out.println("manager salary= " + (1000 +
                (super.getSalaryPerDay() * super.getNumOfDaysWork() * 1.2)));
    }
}


class NormalWorker extends Worker {

    public NormalWorker(String name, double salaryPerDay, int numOfDaysWork) {
        super(name, salaryPerDay, numOfDaysWork);
    }

    public void print() {
        System.out.println("NormalWorker salary= " +
                super.getSalaryPerDay() * super.getNumOfDaysWork() * 1.0);
    }
}
