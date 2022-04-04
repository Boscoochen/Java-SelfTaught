package com.hspedu.generic_;

import java.util.*;

public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("smith", 2000, new Mydate(12, 24, 1963)));
        employees.add(new Employee("jack", 1993, new Mydate(2, 22, 1933)));
        employees.add(new Employee("milan", 20220, new Mydate(5, 14, 1943)));
        employees.add(new Employee("milan", 20220, new Mydate(5, 3, 3234)));
        employees.add(new Employee("milan", 20220, new Mydate(5, 24, 3234)));
        employees.add(new Employee("milan", 20220, new Mydate(3, 12, 22)));
        employees.add(new Employee("milan", 20220, new Mydate(5, 14, 22)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().equals(o2.getName()) ?

                        o1.getBirthday().compareTo(o2.getBirthday())
                        : o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(employees);
    }
}


class Employee {
    private String name;
    private double sal;
    private Mydate birthday;

    public Employee(String name, double sal, Mydate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}

class Mydate implements Comparable<Mydate>{
    private int month;
    private int day;
    private int year;

    public Mydate() {
    }

    public Mydate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Mydate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Mydate o) {
        return ((year - o.getYear() == 0) ?
                (month - o.getMonth() ==0) ?
                       day - o.getDay() :
                        month - o.getMonth()
                :year - o.getYear());
    }
}