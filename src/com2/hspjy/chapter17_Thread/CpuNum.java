package com2.hspjy.chapter17_Thread;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int cpuNum = runtime.availableProcessors();
        System.out.println("当前有cpu 个数=" + cpuNum);
    }
}
