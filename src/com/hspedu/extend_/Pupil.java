package com.hspedu.extend_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("pupil " + name + " is examing...");
    }

    public void showInfo() {
        System.out.println("pupil name " + name + " age" + age + " scores " + score);
    }
}
