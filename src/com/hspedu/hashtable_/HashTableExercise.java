package com.hspedu.hashtable_;

import java.util.Hashtable;


@SuppressWarnings({"all"})
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john", 100);
        table.put("lucy", 100);
        table.put("lic", 100);
        table.put("lic", 80);
        table.put("hello1", 1);
        table.put("hello2", 1);
        table.put("hello3", 1);
        table.put("hello4", 1);
        table.put("hello5", 1);
        table.put("hello6", 1);
        System.out.println(table);
    }
}
