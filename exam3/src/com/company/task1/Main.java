package com.company.task1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Set<Integer> mySet=new HashSet<>();
        for (int i = 0; i < 100; i++) {
            arr[i]=i+1;
        }

        for (int i = 0; i <arr.length ; i++) {
            if (isDivisibleByFive(arr,mySet)&&i%2==0)
                mySet.add(i);
        }
        System.out.println(mySet);
    }
    public static boolean isDivisibleByFive(int[] arr,Set<Integer> mySet){
        boolean r=false;
        for (int value : arr) {
            if (value % 5 == 0) {
                r = true;
                mySet.add(value);

            }
        }
        return r;
    }
}
