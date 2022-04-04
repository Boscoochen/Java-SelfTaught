package com.hspedu.wrapper_.Array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100 );
        books[1] = new Book("金瓶梅新",90 );
        books[2] = new Book("青年文摘20年",5 );
        books[3] = new Book("java从入门到放弃～",300 );

        Book.bubbleSort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (int) o1;
                int i2 = (int) o2;
                return i2 - i1;
            }
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }

    }
}


class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static Book[] bubbleSort(Book[] arr, Comparator c) {
        Book temp = null;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (c.compare(arr[j].price, arr[j + 1].price) < 0) {
                if (c.compare(arr[j].name.length(), arr[j + 1].name.length()) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}