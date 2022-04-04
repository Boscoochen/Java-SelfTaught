package com.hspedu.map_;//package com.hspedu.map_;
//
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//
//@SuppressWarnings({"all"})
//public class MapExercise {
//    public static void main(String[] args) {
//        Map map = new HashMap();
//        Employee smith = new Employee(1, "smith", 1000);
//        Employee jack = new Employee(2, "jack", 19000);
//        Employee scott = new Employee(3, "scott", 3000);
//
//        map.put(smith.getId(), smith);
//        map.put(jack.getId(), jack);
//        map.put(scott.getId(), scott);
//
//        Set set = map.entrySet();
//        for (Object o : set) {
//            Map.Entry entry = (Map.Entry) o;
//
//
//            Employee employee = (Employee) entry.getValue();
//            if(employee.getSalary() > 18000){
////                System.out.println(employee + " " + entry.getValue());
//                System.out.println(employee.getName() + " " +employee.getSalary() +
//                        " " + entry.getKey());
//            }
//
//        }
//
//
//        System.out.println("-----");
//        Set set1 = map.keySet();
//        Iterator iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            Object next =  iterator.next();
//            if(((Employee)map.get(next)).getSalary() > 18000){
//                System.out.println(((Employee)map.get(next)).getName() + " " +
//                        ((Employee)map.get(next)).getSalary() + " " + next);
//            }
//
//        }
//
//
//    }
//}
//
//class Employee {
//    private int id;
//    private String name;
//    private double salary;
//
//    public Employee(int id, String name, double salary) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//}

public class MapExercise {
    public void what() { System.out.print("Shape ");}

    public static void main(String[] args) {

        MapExercise[] shapes = {new MapExercise(), new Rectangle(), new Square(),
                new Circle()};
        for (MapExercise s : shapes)
        {
            s.what();
            System.out.print(" ");
        }
    }

}

class Rectangle extends MapExercise {
    public void what() { System.out.print("Rectangle "); }
}

class Square extends Rectangle {
}

class Oval extends MapExercise {
    public void what() { System.out.print("Oval "); }
}

class Circle extends Oval {
    public void what() { System.out.print("Circle ");}
}
