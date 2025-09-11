package com.week4_d3.string;

/*
When we create string using new it creates new reference in heap, outside of string constant pool,
 if we wanna add this in scp we can do this using intern method but reassign the value to the string
with intern method
 */
public class StringIntern {
    public static void main(String[] args) {

    StringBuilder str = new StringBuilder("Hello");  // initial capacity 16

        String a = new String("Hi");
        String b = new String("Hi");
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String str1 = "How";
        String str2 = new String("How");
        System.out.println(str1==str2);
        str2 = str2.intern();
        System.out.println(str1==str2);
    }

}
