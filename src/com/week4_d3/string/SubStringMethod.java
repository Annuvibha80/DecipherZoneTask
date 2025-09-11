package com.week4_d3.string;

//String is immutable : to change a char in string using substring method in this program

public class SubStringMethod {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(x);

        //change Hello to Hyllo
        System.out.println(s.substring(0,1) +"y" +s.substring(2));
    }
}
