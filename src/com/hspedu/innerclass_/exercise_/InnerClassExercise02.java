package com.hspedu.innerclass_.exercise_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new CellPhone().alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println("lanzhu qichuangle");
            }
        });



        new CellPhone().alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println("xiaohuoban shangkele");
            }
        });

    }
}


interface Bell{
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell){
        bell.ring();
    }
}