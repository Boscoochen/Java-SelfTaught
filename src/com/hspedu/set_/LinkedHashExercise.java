package com.hspedu.set_;

import java.util.LinkedHashSet;
import java.util.Objects;


@SuppressWarnings({"all"})
public class LinkedHashExercise {
    public static void main(String[] args) {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        linkedhashset.add(new Car("奥拓", 1000));
        linkedhashset.add(new Car("奥迪", 300000));
        linkedhashset.add(new Car("法拉利", 10000000));
        linkedhashset.add(new Car("奥迪", 300000));
        linkedhashset.add(new Car("保时捷", 70000000));
        linkedhashset.add(new Car("奥迪", 300000));
        System.out.println(linkedhashset);
    }
}

@SuppressWarnings({"all"})
class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}