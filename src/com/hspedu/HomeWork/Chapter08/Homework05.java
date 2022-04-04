package com.hspedu.HomeWork.Chapter08;

public class Homework05 {
    public static void main(String[] args) {
        worker1 smith = new worker1("smith", 23, 40000);
        farmer jack = new farmer("jack", 22, 35000);
        teacher1 milan = new teacher1("milan", 40, 60000, 20, 28);
        scientist scott = new scientist("scott", 45, 70000, 2000);
        waiter waiter = new waiter("zhangsan", 20, 40000);
        System.out.println(smith.print());
        System.out.println(jack.print());
        System.out.println(milan.print());
        System.out.println(scott.print());
        System.out.println(waiter.print());

    }
}


class Staff {
    private String name;
    private int age;
    private double salary;

    public Staff(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String print(){
        return "name= " + name + " age= " + age + " salary= " + salary;
    }
}

class worker1 extends Staff {
    public worker1(String name, int age, double salary) {
        super(name, age, salary);
    }
    public String print(){
        return "worker info\t" + super.print();
    }
}

class farmer extends Staff {
    public farmer(String name, int age, double salary) {
        super(name, age, salary);
    }
    public String print(){
        return "farmer info\t" + super.print();
    }
}

class teacher1 extends Staff {
    private double salary;
    private double tuiionFee;
    private int numOfDaysWork;

    public teacher1(String name, int age, double salary, double tuiionFee, int numOfDaysWork) {
        super(name, age, salary);
        this.tuiionFee = tuiionFee;
        this.numOfDaysWork = numOfDaysWork;
    }

    public String print(){
        return "teacher info\t" + super.print() + " tuitionfee= " + (this.tuiionFee*this.numOfDaysWork);
    }
}

class scientist extends Staff {
    private double salary;
    private double yearEndAward;

    public scientist(String name, int age, double salary, double yearEndAward) {
        super(name, age, salary);
        this.yearEndAward = yearEndAward;
    }

    public String print(){
        return "scientist info\t" + super.print() + " yearEndAward= " + (this.yearEndAward);
    }

}

class waiter extends Staff {
    public waiter(String name, int age, double salary) {
        super(name, age, salary);
    }

    public String print(){
        return "waiter info\t" + super.print();
    }

}
