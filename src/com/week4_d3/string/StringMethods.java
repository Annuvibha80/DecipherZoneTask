package com.week4_d3.string;

public class StringMethods {
    //charAt, length

    public static void main(String[] args) {
        String str = "Hello";
        int len = str.length();
        System.out.println(len);

        char ch = str.charAt(3);
        System.out.println(ch);

        int a = str.indexOf('l');
        System.out.println(a);
        System.out.println(str.indexOf('o'));
        //here is 2 l but we index of will give index of first l

        String str1 = "How Are You";
        String str2 = "Wow great";
        System.out.println(str1.compareTo(str2));

        System.out.println(str1.contains("ow"));
        System.out.println(str1.startsWith("H"));
        System.out.println(str1.startsWith("Ho"));
        System.out.println(str1.endsWith("You"));

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String name = "Annuvibha";
        String surname = " Sharma";
        System.out.println(name.concat(surname));

        String Pname = "Kajal";
        System.out.println(Pname.substring(0, 3));
        System.out.println(Pname.substring(1));
    }
}
