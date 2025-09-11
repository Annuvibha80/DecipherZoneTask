package com.week4_d3.string;

//In Java, how do you convert a string to an integer and vice versa?

public class StringToInt {
    public static void main(String[] args) {
        String str= "12346";

        int a = Integer.parseInt(str);
        System.out.println(a);

        String str2 ="1234";
        int b = Integer.valueOf(str2);
        System.out.println(b);

        int c = a+b;
        System.out.println("Int addition after string converted to int : " +c );

        String s1 = Integer.toString(a);
        System.out.println(s1);

        String s2 = String.valueOf(b);
        System.out.println(s2);

        System.out.println("String addition after int converted to string : " +s1+s2);
    }
}
