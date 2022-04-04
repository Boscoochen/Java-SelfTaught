package com.hspedu.poly_.Polyarr_;

public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String say() {
        return "Teacher " + super.say() + " salary=" + salary;
    }

    public void teach() {
        System.out.println("teacher " + getName() + " is teaching Java");
    }
}
