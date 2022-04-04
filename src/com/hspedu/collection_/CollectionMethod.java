package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //interface
        List list = new ArrayList();
        list.add("jack");
        list.add(19);
        list.add(true);
        System.out.println("list=" + list);
//        list.remove(0);
//        list.remove("jack");
//        list.remove(true);
        System.out.println(list.contains("jack~"));
        System.out.println("list=" + list);
        list.remove("jack");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
//        list.clear();
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println("list=" + list);
        System.out.println(list.containsAll(arrayList));
        list.removeAll(arrayList);
        System.out.println("list=" + list);
    }
}



