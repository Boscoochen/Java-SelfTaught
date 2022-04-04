package com.hspedu.collection_;

import java.util.*;


@SuppressWarnings({"all"})
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);
        System.out.println(m);
        m.replace("jack", 2600);
        System.out.println(m);
        Set set = m.keySet();
//        Collection collection = m.values();
//        Object[] obj = set.toArray();
//        Object[] obj2 = collection.toArray();
//        for (int i = 0; i < obj.length; i++) {
//            m.replace((String)obj[i], (Integer)obj2[i] + 100);
//        }
        for (Object key :set) {
            m.put(key, (Integer)m.get(key) + 100);
        }

        Set entryset = m.entrySet();
        for (Object o : entryset) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("=====");
        Iterator iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println(m);



    }
}


