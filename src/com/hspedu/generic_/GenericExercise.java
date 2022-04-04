package com.hspedu.generic_;

import java.util.*;

@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("smith", 10));
        students.add(new Student("jack", 20));
        students.add(new Student("milan", 30));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("iterator=======");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student next =  iterator.next();
            System.out.println(next);
        }


        HashMap<String, Student> stringStudentHashMap = new HashMap<String, Student>();
        stringStudentHashMap.put("jack", new Student("jack", 10));
        stringStudentHashMap.put("smith", new Student("smith", 20));
        stringStudentHashMap.put("milan", new Student("milan", 30));

        Set<String> set = stringStudentHashMap.keySet();
        for (String s : set) {
            System.out.println(s + "-" + stringStudentHashMap.get(s));
        }

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> next =  iterator1.next();
            System.out.println(next.getKey() + "-" + next.getValue());

        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}