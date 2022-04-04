package com.hspedu.generic_;

public class Geneic03 {
    public static void main(String[] args) {
        Person<String> abc = new Person<String>("abc");

    }
}


class Person<E> {
    E s;

    public Person(E s) {
        this.s = s;
    }


    public E f() {
        return s;
    }
}