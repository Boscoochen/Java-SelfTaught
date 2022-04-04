package com.hspedu.list_;

import java.util.*;

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
//        List list = new ArrayList();
        List list = new Vector();
//        List list = new LinkedList();
        list.add(new Book("红楼梦", 100, "曹雪芹"));
        list.add(new Book("西游记", 10, "吴承恩"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));

        Book.bubble(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int res = 0;
                if(((Book)o1).getPrice() - ((Book)o2).getPrice() < 0){
                    res = 1;
                }else{
                    res = -1;
                }
                return res;
            }
        });

        for (Object o :list) {
            System.out.println(o);
        }


    }
}

@SuppressWarnings({"all"})
class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void bubble(List list, Comparator comparator) {
        Object temp = null;
        for (int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - i - 1; j++){
                if(comparator.compare(list.get(j), list.get(j+1)) < 0){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t" +
                "价格: " + price + "\t" +
                "作者: " + author;
    }
}