package com.hspedu.enum_.homework_;

import com.hspedu.super_.B;
import com.sun.jdi.connect.Connector;

public class Homework06 {
    public static void main(String[] args) {
        Person tangzeng = new Person("唐憎", new Horse());
        tangzeng.common();
        tangzeng.passRiver();

        tangzeng.common();
        tangzeng.common();
        tangzeng.passRiver();
        tangzeng.common();
        tangzeng.common();
        tangzeng.passRiver();
        tangzeng.passFireMountain(new Vehicles() {
            @Override
            public void work() {
                System.out.println("fire mountain, ride plane");
            }
        });

    }
}



interface Vehicles {
    public void work();
}

class TrafficCompany {
    private static Horse bailongma = new Horse();

    private TrafficCompany(){}

    public static Horse getHorse() {
        return bailongma;
    }

    public static Boat getBoat() {
        return new Boat();
    }

//    public static Plane getPlane() {
//        return new Plane();
//    }
}


class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("normal situation, ride horse");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("river, ride boat");
    }
}
//class Plane implements Vehicles {
//    @Override
//    public void work() {
//        System.out.println("fire mountain, ride plane");
//    }
//}



class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if(!(vehicles instanceof Boat)){
            vehicles = TrafficCompany.getBoat();
        }

       vehicles.work();
    }

    public void common() {

        if(!(vehicles instanceof Horse)) {
            vehicles = TrafficCompany.getHorse();
        }
        vehicles.work();
    }

//    public void passFireMountain() {
//
//        if(!(vehicles instanceof Plane)) {
//            vehicles = TrafficCompany.getPlane();
//        }
//        vehicles.work();
//    }

    public void passFireMountain(Vehicles vehicles) {
        vehicles.work();
    }



}


