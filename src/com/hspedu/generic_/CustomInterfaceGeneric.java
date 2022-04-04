package com.hspedu.generic_;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}


interface Iusb<U, R> {
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u){
        return null;
    }
}

interface IA extends Iusb<String, Double> {

}

class BB implements Iusb<Integer, Float> {
    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }

    @Override
    public Float method(Integer integer) {
        return null;
    }
}


class AA implements IA {
    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }

    @Override
    public Double method(String s) {
        return null;
    }
}