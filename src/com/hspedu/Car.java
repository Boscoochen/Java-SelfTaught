package com.hspedu;

public class Car {
    public String brand = "bmw";
    public int price = 500000;
    public String color = "white";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
