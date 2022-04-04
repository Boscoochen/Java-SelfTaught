package com.hspedu.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie nihao_nihuanying = new Movie("nihao nihuanying");
        Movie movie = new Movie("tantang3", 100, "chensicheng");
    }
}


class Movie {
    private String name;
    private double price;
    private String director;

    static {
        System.out.println("movie monitor open");
        System.out.println("advertisement start");
        System.out.println("movie start");
    };


    public Movie(String name) {

        System.out.println("Movie(String name) is called...");
        this.name = name;
    }

    public Movie(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) is called...");

        this.name = name;
        this.price = price;
        this.director = director;
    }
}
