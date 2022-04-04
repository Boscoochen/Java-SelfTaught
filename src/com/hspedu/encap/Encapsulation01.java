package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackssssssssss");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        Double res = person.getSalary("bc");
        if (res != null) {
            System.out.println("salary = " + res);
        } else {
            System.out.println("wrong password");
        }

        Person person1 = new Person("smith", 2000, 50000);
        System.out.println("=============smith================");
        System.out.println(person1.info());
    }
}


class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }


    public String getName() {
        return name;
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else {
            System.out.println("name is too long, need (2-6) characters, default name");
            this.name = "no_one";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("age error,age need to between (1-120), default age: 18");
            this.age = 18; //default age
        }
    }

    public Double getSalary(String password) {
        if ("abc".equals(password)) {
            return salary;
        } else {
            return null;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "info name=" + name + " age=" + age + " salary=" + salary;
    }
}
