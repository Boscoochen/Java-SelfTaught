package com.hspedu.abstract_.exercise_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager smith = new Manager("smith", 1234, 200000);
        smith.work();
        CommonEmployee jack = new CommonEmployee("jack", 3456, 100000);
        jack.work();
    }
}



abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}


class Manager extends Employee{
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public double setBonus(double bonus) {
        return bonus;
    }

    public void work() {
        System.out.println("Manager " + this.getName() + " is working...");
    }
}


class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("CommonWorker " + this.getName() + " is working...");
    }
}