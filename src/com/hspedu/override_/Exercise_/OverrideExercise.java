package com.hspedu.override_.Exercise_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("jack", 32);
        System.out.println(person.say());
        System.out.println("==============");
        Student student = new Student("smith", 20, 0223, 90.3);
        System.out.println(student.say());
    }
}
