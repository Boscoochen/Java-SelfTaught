package com.hspedu.set_;

import java.util.HashSet;

@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        hashset.add("java");
        hashset.add("php");
        hashset.add("java");
        hashset.add(hashset);
    }
}
