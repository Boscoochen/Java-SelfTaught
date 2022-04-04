package com.hspedu.exception_;

public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person2 person = new Person2();
            person = null;
            System.out.println(person.getName());

            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}



class Person2 {
    private String name = "jack";

    public String getName() {
        return name;
    }
}

