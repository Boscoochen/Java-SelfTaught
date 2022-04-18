package com.hspedu.properties_.homework_;

public class quiz {

    public static void main(String[] args) {
        quiz quiz = new quiz();
        quiz.CanInterate();
    }

    private final int i = 99;
    public void CanInterate() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for(i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }


        System.out.println(i);
    }
}
