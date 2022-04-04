package com.hspedu.map_;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o2).length() - ((String)o1).length();
            }
        });
        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯缇娜");
        treeMap.put("smith", "斯密丝");
        treeMap.put("hsp", "han");

        System.out.println(treeMap);
    }
}
