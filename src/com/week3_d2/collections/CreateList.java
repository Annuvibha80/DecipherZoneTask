package com.week3_d2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This code is for creating List
public class CreateList {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 3, 4, 5, 6, 7); //this is immutable list object

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(14);
        list2.add(14);
        list2.add(14);
        System.out.println("List2 values : " +list2);

        List <Integer > list3 = Arrays.asList(2,4,6,8);
        System.out.println("List 3 values : " +list3);

        List <Integer > listEven = new ArrayList<>();



        for(Integer i : list1){
            if(i%2 == 0){
                listEven.add(i);
            }
        }

        System.out.println(list1);
        System.out.println(listEven);
    }

}



