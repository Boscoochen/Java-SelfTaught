package com.hspedu.map_;

import java.util.Properties;


@SuppressWarnings({"all"})
public class Properties_ {
    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put("john", 100);
//        properties.put(null, 100);
//        properties.put("john", null);
        properties.put("lucy", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);

        System.out.println(properties);
        System.out.println(properties.get("lic"));
//        properties.remove("john");
        properties.put("john","hsp");
        System.out.println(properties);
    }
}
