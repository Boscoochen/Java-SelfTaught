package com.hspedu.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        hashset.add(new Employee("smith", 20));
        hashset.add(new Employee("jack", 20));

        hashset.add(new Employee("smith", 20));



    }
}



class Employee {
    private String name;
    private double age;

    public Employee(String name, double age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object o) {
////        if (this == o || this.name.equals(((Employee)o).name) && this.age == ((Employee)o).age) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        return this == o || this.name.equals(((Employee)o).name) && this.age == ((Employee)o).age;
////        Employee employee = (Employee) o;
////        return Double.compare(employee.age, age) == 0 && name.equals(employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.age, age) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}