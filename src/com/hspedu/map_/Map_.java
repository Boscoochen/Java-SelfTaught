package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;



@SuppressWarnings({"all"})
public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","hsp");
        map.put("no2", "zhangwuji");
        map.put("no1", "zjamgsanfeng");
        map.put("no3", "zjamgsanfeng");
        map.put(null, null);
        map.put(null, "abc");
        map.put("no5", null);
        map.put(1, "zhaomin");
        map.put(new Object(), "jinmaoshiwang");
        System.out.println(map.get("no2"));
    }
}
