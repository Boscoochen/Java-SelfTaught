package com.hspedu.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("normal worker " + getName() + " is working" );
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
