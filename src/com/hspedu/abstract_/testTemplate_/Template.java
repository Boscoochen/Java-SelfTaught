package com.hspedu.abstract_.testTemplate_;

abstract class Template {
    public abstract void job();
    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("mission run time " + (end - start));
    }
}
