package com.hspedu.list_;

import java.util.*;

public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();


        list.add("jack");
        list.add("tom");
        list.add("fish");
        list.add("duck");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("========");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("========");
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
