package com.hspedu.HomeWork.Chapter08;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor = new Professor("smith", 33, "chemistry", 1.3);
        ProfessorAssistance professorAssistance = new ProfessorAssistance("jack", 20, "physic", 1.2);
        NormalTeacher normalTeacher = new NormalTeacher("milan", 23, "math", 1.1);
        System.out.println(professor.introduce());
        System.out.println(professorAssistance.introduce());
        System.out.println(normalTeacher.introduce());
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public String introduce() {
        return this.name + " " + this.age + " " + this.post + " " + this.salary;
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    public String introduce() {
        return "Professort\t\t" + super.introduce();
    }

}

class ProfessorAssistance extends Teacher {
    public ProfessorAssistance(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    public String introduce() {
        return "ProfessorAssistance\t\t" + super.introduce();
    }

}

class NormalTeacher extends Teacher {
    public NormalTeacher(String name, int age, String post, double salary){
        super(name, age, post, salary);
    }

    public String introduce() {
        return "NormalTeacher\t\t" + super.introduce();
    }

}

