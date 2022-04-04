package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhangsanfeng");
        list.add("jiabaoyu");
        list.add(1, "hanshunp");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1, list2);
        System.out.println(list);
        System.out.println(list.indexOf("tom"));
        list.add("hanshunp");
        System.out.println(list);
        System.out.println(list.lastIndexOf("hanshunp"));
        list.remove(0);
        System.out.println(list);
        list.set(1, "mali");
        System.out.println(list);
        List returnlist = list.subList(0,2);
        System.out.println(returnlist);
    }
}
