package com.hspedu.poly_.Polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 30.1);
        persons[3] = new Teacher("scott", 30, 20000);
        persons[4] = new Teacher("king", 50, 25000);

        //dynamic binding
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                Student s1 = (Student) persons[i];
                s1.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher t1 = (Teacher) persons[i];
                t1.teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("type error");
            }
            System.out.println(persons[i].say());
            System.out.println("=========");
        }


    }
}