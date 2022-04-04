package com.hspedu.wrapper_.Array;

import java.util.Arrays;
import java.util.List;

public class ArrayMethod02 {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6};
//        int index = Arrays.binarySearch(arr, 6);
//        System.out.println(index);
//
//        int[] newArr = Arrays.copyOf(arr, arr.length - 2);
//        System.out.println(Arrays.toString(newArr));
//
//        Arrays.fill(newArr, 90);
//        System.out.println(Arrays.toString(newArr));
//        boolean equals = Arrays.equals(arr, newArr);
//        System.out.println(equals);

        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList's run type" + asList.getClass());

    }
}
