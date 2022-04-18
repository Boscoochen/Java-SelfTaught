package com.hspedu.printstream_;

import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) throws Exception{
        PrintStream out = System.out;
        out.print("john, hello");
        out.write("adfafad".getBytes());
        out.close();
    }
}
