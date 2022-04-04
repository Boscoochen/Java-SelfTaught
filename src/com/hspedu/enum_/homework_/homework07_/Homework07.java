package com.hspedu.enum_.homework_.homework07_;

public class Homework07 {
    public static void main(String[] args) {
        new Car(40).getAir().flow();
        new Car(0).getAir().flow();
        new Car(41).getAir().flow();
    }
}



class Car {
    private double temperature;
    public Car(double temperature) {
        this.temperature = temperature;

    }
    public class Air {
        public void flow() {
            if(Car.this.temperature > 40){
                blowCool();
            }else if(Car.this.temperature < 0){
                blowHot();
            }else{
                turnOff();
            }
        }

        public void blowCool() {
            System.out.println("blow cool air");
        }

        public void blowHot() {
            System.out.println("blow hot air");
        }

        public void turnOff() {
            System.out.println("turn off");
        }
    }


    public Air getAir() {
        return new Air();
    }
}