package com.hspedu.map_;

import java.util.*;


@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        Set set = map.keySet();

        for (Object key : set) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println("------");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + " " + map.get(next));
        }
        System.out.println("------");
        Collection collection = map.values();
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("------");
        iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("------");
        Set set1 = map.entrySet();
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("------iterator");
        iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + " " + entry.getValue());
//            System.out.println(next.getClass());
//            System.out.println(next);
        }
        System.out.println("------normal for");
//        for (int i = 0; i < set1.size(); i++) {
//            Object o =
//        }

    }
}
