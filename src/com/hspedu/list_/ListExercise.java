package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //up transform
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("jack");
        list.add("milan");
        list.add("smith");
        list.add("scott");
        list.add("zhangsanfen");
        list.add("hongloumen");
        list.add("sanguoyanyi");
        list.add("zhangsan");
        list.add("sss");
        list.add("sandy");
        list.add("amey");
        System.out.println(list);
        list.add(1, "hspedu");
        System.out.println(list);
        System.out.println(list.get(4));
        list.remove(5);
        System.out.println(list);
        list.set(6, "smith");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
