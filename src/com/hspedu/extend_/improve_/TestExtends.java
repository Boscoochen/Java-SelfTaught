package com.hspedu.extend_.improve_;

public class TestExtends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "jack";
        pupil.age = 12;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("================");

        Graduate graduate = new Graduate();
        graduate.name = "smith";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();

    }
}
