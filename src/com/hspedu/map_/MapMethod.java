package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        System.out.println(map);
        map.remove(null);
        System.out.println(map);
        Object val = map.get("鹿晗");
        System.out.println(val);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
//        map.clear();
        System.out.println(map.containsKey("王宝强"));

    }
}



@SuppressWarnings({"all"})
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}