package com.hspedu.exception_;

import java.util.Date;

public class exercise {


}


class Person {
    public static void main(String[] args) {
        Object obj = new Date();
        Person person;
        person = (Person)obj;
        System.out.println(person);
    }
}