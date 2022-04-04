package com.hspedu.wrapper_;

public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d; // Double d = Double.valueOf(100d)
        Float f = 1.5f;  // Float f = Float.valueOf(1.5f)

        //三元运算符是一个整体， Double 是优先级
        Object obj1 = true? new Integer(1): new Double(2.0);
        System.out.println(obj1);

        Object obj2;
        if(true){
            obj2 = new Integer(1);
        }else {
            obj2 = new Double(2.0);
        }
        System.out.println(obj2);
    }
}
