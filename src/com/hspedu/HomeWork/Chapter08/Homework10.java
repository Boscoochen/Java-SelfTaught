package com.hspedu.HomeWork.Chapter08;

import javax.print.Doc;

public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("smith", 40, "doctor", 'm', 1000000);
        Doctor doctor1 = new Doctor("smith", 40, "doctor", 'm', 1000000);
        System.out.println(doctor.equals(doctor1));
    }
}


class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        //ensure this has the same address with obj
        if(this == obj) {
            return true;
        }

        //if they are pointing at different object, then compare their attributes
        if(obj instanceof Doctor){
            Doctor doctor = (Doctor)obj;
            if(doctor.name.equals(this.name) &&
                    doctor.age == this.age && doctor.job.equals(this.job) &&
                    doctor.gender == this.gender && doctor.sal == this.sal){
                return true;
            }
        }
        return false;

    }


}