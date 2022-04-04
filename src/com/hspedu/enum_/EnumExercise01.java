package com.hspedu.enum_;

public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.aOY;
        Gender2 boy2 = Gender2.aOY;
        System.out.println(boy);
        System.out.println(boy2 == boy);

    }
}


enum Gender2 {
    aOY, GIRL;
}

//Gender2{}
//true