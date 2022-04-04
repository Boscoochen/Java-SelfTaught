package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {

    }
}

class AA {
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA() {
        TAX_RATE2 = 0.9;
    }

    {
        TAX_RATE3 = 3;

    }
}


class BB {
    public static final double TAX_RATE = 11;
    public static final double TAX_RATE2;
    static {
            TAX_RATE2 = 2;

    }
    public BB() {
    }
}
