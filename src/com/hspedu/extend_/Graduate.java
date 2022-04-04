package com.hspedu.extend_;

public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("graduate " + name + " is examing...");
    }

    public void showInfo() {
        System.out.println("student name " + name + " age" + age + " scores " + score);
    }
}
