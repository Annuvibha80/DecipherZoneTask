package com.week3_d2.collections;

import java.util.HashMap;


//this code is for getting the frequency of element in a array

public class Frequency {
    public static void majorityelement(int[] num){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=1; i< num.length; i++){
            map.put(num[i], map.getOrDefault(num[i], 0 )+1);
        }
        for(int i : map.keySet()){
            System.out.println("element : " +i  +" | values : " +map.get(i));
        }
    }
    public static void main(String[] args) {

        Frequency.majorityelement(new int[] {1 ,3 , 4 , 1 , 1 ,6 ,3});
    }
}
