package com.hspedu.exception_;

public class CustomException {
    public static void main(String[] args){
        int age = 19;
        if(!(age >= 18 && age <= 120)){
            throw new AgeException("age need to be 18-20");
        }
    }
}




class AgeException extends RuntimeException { //default throws runtime exception
    public AgeException(String message) {
        super(message);
    }
}
