package com.hspedu.extend_.improve_;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("student name " + name + " age" + age + " scores " + score);
    }
}
