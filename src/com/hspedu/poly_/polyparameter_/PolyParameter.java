package com.hspedu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.testWork(tom);
        System.out.println("==========");
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if(e instanceof Worker){
            ((Worker)e).work();
        }else if(e instanceof Manager){
            ((Manager)e).manage();
        }else{
            System.out.println("something get wrong");
        }
    }
}
