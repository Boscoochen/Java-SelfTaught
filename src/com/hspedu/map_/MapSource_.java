package com.hspedu.map_;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","韩顺平");
        map.put("no2", "张无忌");

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {
//            System.out.println(obj.getClass());
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey());
        }

        Set set1 = map.keySet(); //map.keySet() is a set type
        System.out.println(set1.getClass());
        Collection value = map.values(); //map.values() is Collection type
        System.out.println(value.getClass());

    }
}
