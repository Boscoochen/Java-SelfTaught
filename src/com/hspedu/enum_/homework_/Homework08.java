package com.hspedu.enum_.homework_;

public class Homework08 {
    public static void main(String[] args) {
        Color.RED.show(Color.RED);
        Color.BLUE.show(Color.BLUE);
        Color.BLACK.show(Color.BLACK);
        Color.YELLOW.show(Color.YELLOW);
        Color.GREEN.show(Color.GREEN);
    }
}



enum Color implements Enter{
    RED(255, 0, 0),
    BLUE(0,0,255), BLACK(0,0,0),
    YELLOW(255,255,0), GREEN(0,255,0);
    private int redValue, greenValue, blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show(Color color) {
//        Color[] colors = Color.values();
//        for(Color color : colors) {
//            System.out.println(color);
//        }
        switch(color) {
            case RED:
                System.out.println(color);
                break;
            case BLUE:
                System.out.println(color);
                break;
            case BLACK:
                System.out.println(color);
                break;
            case YELLOW:
                System.out.println(color);
                break;
            case GREEN:
                System.out.println(color);
                break;
            default:
                System.out.println("wrong input~");
                break;
        }
    }

    @Override
    public String toString() {
        return redValue + " " + greenValue + " " + blueValue;
    }
}

interface Enter{
    public void show(Color name);
}