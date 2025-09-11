package com.week4_d3.string;

//==
//equals
//equalsIgnoreCase
//compareTo
//subsequence method
public class StringComparisonMehtod {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = new String("Apple");

//        str2 = str2.intern();
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3 = "AnnuViBhA";
        String str4 = "annuViBHA";
        System.out.println(str3.equalsIgnoreCase(str4));

        String str5 = "Pasta";
        String str6 = "Pasta";
       // System.out.println(Object.equals(str5, str6));  error
        System.out.println(str5.compareTo(str6));


        String str8 = "AnnuViBhA";
        System.out.println(str8.subSequence(2,4));
        CharSequence sub = str8.subSequence(1, 6);
        System.out.println(sub);
    }
}
