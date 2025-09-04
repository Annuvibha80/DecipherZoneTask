package com.week3_d1.exceptions;

//Array Index out of bound exception

public class ArrayIOBException {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c"};
        System.out.println(a[3]);
    }
}
