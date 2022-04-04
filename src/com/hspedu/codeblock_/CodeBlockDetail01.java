package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        System.out.println(BB.n1);
        new BB();
    }
}



class AA {
    static {
        System.out.println("AA's static block 1 run");
    }
    {
        System.out.println("AA's normal block 1 run");
    }
    public AA () {
        System.out.println("AA's Constructor run");
    }
}

class BB extends AA {
    public static int n1 = 999;
    static {
        System.out.println("BB's static block 1 run");
    }
    {
        System.out.println("BB's normal block 1 run");
    }
}
