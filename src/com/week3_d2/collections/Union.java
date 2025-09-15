package com.week3_d2.collections;


//this code is for union of 2 arrays and returns the size as well

import java.util.HashSet;

public class Union {
    public static int Unionmethod(int[] num1, int[] num2){
        HashSet <Integer> set = new HashSet<>();

        for(int i=0; i<num1.length; i++){
            set.add(num1[i]);
        }

        for(int j=0; j< num2.length; j++){
            set.add(num2[j]);
        }
        System.out.println(set);
        return set.size();
    }
    public static void main(String[] args) {
        System.out.println(Union.Unionmethod(new int[] {1,1,2,3,4} , new int[] {1,1,6,8,9,10,20}));
    }
}
