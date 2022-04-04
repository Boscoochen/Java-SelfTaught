package com.hspedu.HomeWork.Chapter08.homework13_;

public class Homework13 {
    public static void main(String[] args) {
        Person[] pArr = new Person[4];
        Person person = new Person("", ' ', 0);
        Student student = new Student("smith", 'm', 20, "12345");
        Student student1 = new Student("jack", 'm', 15, "34000");

        Teacher teacher = new Teacher("milan", 'F', 44, 12);
        Teacher teacher1 = new Teacher("scott", 'm', 50, 20);

        pArr[0] = student;
        pArr[1] = student1;
        pArr[2] = teacher;
        pArr[3] = teacher1;

        person.Display(pArr);
        person.BobbleSort(pArr);
        System.out.println("===========After sorting===============");
        person.Display(pArr);


        System.out.println("===========(8)=============");
        person.useStudyTeachMethod(student);
        person.useStudyTeachMethod(teacher);

    }
}


class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(super.getName() + " i promise i study hard");
    }

    public String Play(){
        return super.getName() + super.Play() + "soccer";
    }

    public String Introduce(){
        return "Student info " + super.Introduce() + " studentid: " + this.stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}


class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println(super.getName() + " i promise i teach hard");
    }

    public String Play(){
        return super.getName() + super.Play() + "chess";
    }

    public String Introduce(){
        return "Teacher info " + super.Introduce() + " workage: " + this.work_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}

class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String Play() {
        return " love to play ";
    }

    public String Introduce() {
        return this.name + " " + this.age + " " + this.sex;
    }

    public void BobbleSort(Person[] pArr) {

        int[] newArr = new int[pArr.length];
        for (int i = 0; i < pArr.length; i++) {
            if(pArr[i] instanceof Student){
                newArr[i] = ((Student)pArr[i]).getAge();

            }else if(pArr[i] instanceof Teacher){
                newArr[i] = ((Teacher) pArr[i]).getAge();
            }
        }

        Person temp = null;
        for (int i = 0; i < newArr.length - 1; i++) {
            for(int j = 0; j < newArr.length - i - 1; j++){
                if(newArr[j] > newArr[j + 1]){
                    temp = pArr[j];
                    pArr[j] = pArr[j + 1];
                    pArr[j + 1] = temp;
                }
            }
        }
    }

    public void Display(Person[] pArr) {
        for (int i = 0; i < pArr.length; i++) {
            if(pArr[i] instanceof Student){
                Student student = (Student)pArr[i];
                System.out.println(student.toString());
                student.study();
                System.out.println(student.Play());

            }else if(pArr[i] instanceof Teacher){
                Teacher teacher = (Teacher)pArr[i];
                System.out.println(teacher.toString());
                teacher.teach();
                System.out.println(teacher.Play());
            }
            System.out.println("--------------");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public void useStudyTeachMethod(Person p) {
        if(p instanceof Student) {
            ((Student)p).study();
        }else if(p instanceof Teacher) {
            ((Teacher)p).teach();
        }
    }
}