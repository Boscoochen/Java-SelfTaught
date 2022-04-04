package com.hspedu.interface_;

public class InterfaceDetail02 {

    public static void main(String[] args) {

    }

    public void Interface(IB ib) {
        int a = ib.n1 + 2;

        System.out.println(IB.n1);

    }
}

interface ID extends IB, iC {

}

interface IB {
    int n1 = 10;
    void hi();
}

interface  iC{
    void say();
}


class Pig implements IB, iC{
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

interface IE {

}