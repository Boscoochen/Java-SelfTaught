package com.hspedu.set_;


import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 1; i <= 7; i++) {
            hashSet.add(new A(i));
        }
        for (int i = 1; i <= 7; i++) {
            hashSet.add(new B(i));
        }
    }
}


class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}


class B{
    private int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}