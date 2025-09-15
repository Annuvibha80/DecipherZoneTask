package com.week3_d1.exceptions;

public class StringIOOBException {


    public static void main(String[] args) {
        String str = "This is msi laptop with RTX 3050";
        char ch = str.charAt(100);
        System.out.println(ch);
    }
}
