package com.hspedu.extend_;

public class Sub extends Base {

    public Sub(String name, int age) {
       // super();//base class no parameter constructor
        //super("hsp");
        super("hsp", 30);
        System.out.println("sub(String name, int ge)....");
    }
    public Sub() {
        //super(); //default call base class constructor
        super("smith", 10);
        System.out.println("sub()....");
    }

    public Sub(String name) {
        // do nothing...
        super("Tom", 30);
        System.out.println("sub(String name)....");
    }

    public void sayOk() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        test100();
        test200();
        test300();
        System.out.println("n4=" + getN4());
        callTest400();

    }
}
