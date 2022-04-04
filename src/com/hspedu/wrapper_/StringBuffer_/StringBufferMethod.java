package com.hspedu.wrapper_.StringBuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(',');
        s.append("zhangsanfen");
        s.append("zhaomin").append(100).append(true).append("hello");
        System.out.println(s);
        s.delete(11,15);
        System.out.println(s);
        s.replace(3,8, "zhouzhiruo");
        System.out.println(s);

        int indexOf = s.indexOf("zhaomin");
        System.out.println(indexOf);
        s.insert(18, "zhouzhiruo");
        System.out.println(s);
        System.out.println(s.length());
    }
}
