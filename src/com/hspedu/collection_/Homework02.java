package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;


@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Car car = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        list.add(car);
        list.add(car2);
        System.out.println(list);
        list.remove(car2);
        System.out.println(list);
        System.out.println(list.contains(car));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();


        ArrayList list2 = new ArrayList();
        list2.add(car);
        list2.add(car2);
        System.out.println(list.addAll(list2));
        System.out.println(list.containsAll(list2));
        System.out.println(list.removeAll(list2));
        list.addAll(list2);
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("=========");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }


    }
}


class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}