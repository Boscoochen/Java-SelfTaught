package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance.hashCode());
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1.hashCode());
        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2.hashCode());

//        System.out.println(GirlFriend.n1);
    }
}


class GirlFriend {
    private String name;

//    public static int n1;
    private static GirlFriend gf = new GirlFriend("xiaohonghong");


    private GirlFriend(String name) {
        System.out.println("constructor is called");
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}





