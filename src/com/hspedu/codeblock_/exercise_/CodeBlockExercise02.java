package com.hspedu.codeblock_.exercise_;

public class CodeBlockExercise02 {
    Sample sam1 = new Sample("sam1member initialize");
    static Sample sam = new Sample("static sam initialized"); //(1)
    static {
        System.out.println("static is ran");
        if(sam == null) {
            System.out.println("sam is null");
        }
    }

    CodeBlockExercise02(){
        //super()
        //static block or static attributes and method
        //normal block or attributes and method
        System.out.println("Test default constructor is called");
    }

    public static void main(String[] args) {
        CodeBlockExercise02 a = new CodeBlockExercise02();
    }
}


class Sample{
    Sample(String s) {
        System.out.println(s);
    }

    Sample() {
        System.out.println("Sample default constructor is called");
    }
}

//load class


//static sam initialized
//static is ran
//sam1member initialize
//Test default constructor is called