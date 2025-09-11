package com.week4_d3.string;

public class StringToStringBuilder {
    public static void main(String[] args) {
        String s1 = "Annuvibha";
        String s2 = "Kajal";

        StringBuilder obj = new StringBuilder(s1);
        StringBuilder obj1 = new StringBuilder(s2);

        System.out.println(obj.append(s2));

        System.out.println(s1.isEmpty());
    }



}
