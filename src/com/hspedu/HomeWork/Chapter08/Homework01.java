package com.hspedu.HomeWork.Chapter08;

public class Homework01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 18, "software engineer");
        Person person1 = new Person("smith", 30, "test automation engineer");
        Person person2 = new Person("milan", 21, "full stack engineer");
        Person[] pArr = new Person[3];
        pArr[0] = person;
        pArr[1] = person1;
        pArr[2] = person2;
        person.display(pArr);
        person.bubbleSort(pArr);
        System.out.println("\n==========After sorting==========\n");
        person.display(pArr);
    }
}


class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void bubbleSort(Person[] pArr) {
        Person temp = null;
        for (int i = 0; i < pArr.length - 1; i++) {
            for(int j = 0; j < pArr.length - i - 1; j++){
                if(pArr[j].age < pArr[j+1].age){
                    temp = pArr[j];
                    pArr[j] = pArr[j+1];
                    pArr[j+1] = temp;
                }
            }
        }
    }

    public void display(Person[] pArr) {
        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].name + " " + pArr[i].age + " " + pArr[i].job);
        }
    }
}
