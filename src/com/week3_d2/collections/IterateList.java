package com.week3_d2.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//This code is for printing the list with 3 methods
public class IterateList {

    public static void main(String[] args) {

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(14);
        list2.add(14);
        list2.add(14);
        //1 direct print
        System.out.println("List2 values : " +list2);

        //2 for loop
        for(int i=0; i<list2.size(); i++){
            System.out.print(" " +list2.get(i));
        }

        System.out.println();

        //3 Iterator method
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            Integer element  = it.next();
            System.out.print(" "  +element);
        }

    }

}



