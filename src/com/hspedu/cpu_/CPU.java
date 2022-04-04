package com.hspedu.cpu_;

public class CPU {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNumbers = runtime.availableProcessors();
        System.out.println(cpuNumbers);

    }
}
