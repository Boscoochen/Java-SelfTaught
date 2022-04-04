package com.hspedu.abstract_.testTemplate_;

public class AA extends Template{

    public void job() {
        long num = 0;
        for (long i = 1; i <= 800000; i++) {
            num += i;
        }
    }

    public void job2() {
        long num = 0;
        for (long i = 1; i <= 200000; i++) {
            num += i;
        }
    }
}
