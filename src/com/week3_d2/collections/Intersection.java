package com.week3_d2.collections;

import java.util.HashSet;

public class Intersection {
    public static int intersectionmethod(int[] arr1 , int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count =0;

        for(int i=0; i< arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int j=0; j< arr2.length; j++){
            if(set.contains(arr2[j])){
                count ++;
                set.remove(arr2[j]);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        System.out.println(  Intersection.intersectionmethod(new int[] {1,2,3,4,10,1,1} , new int[] {3,4,1,10,20}));
    }
}
