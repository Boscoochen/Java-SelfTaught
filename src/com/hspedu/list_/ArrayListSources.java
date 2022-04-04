package com.hspedu.list_;

import java.util.ArrayList;


@SuppressWarnings({"all"})
public class ArrayListSources {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
//        ArrayList list = new ArrayList(8);
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for(int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
