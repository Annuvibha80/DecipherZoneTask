package com.week4_d3.string;
import java.util.StringJoiner;

//add method, toString,
public class StringJoinerMethods {
    public static void main(String[] args) {

        //add method
        StringJoiner obj = new StringJoiner(", ");
        obj.add("MSI").add("Laptop").add("i7");
        System.out.println(obj.toString());

        // Using StringJoiner with Array of Strings
        String[] s2 = {"MSI", "Dell", "hp"};
        StringJoiner obj2 = new StringJoiner(" | "," [ "," ] " );

        for(String s3 : s2){
            obj2.add(s3);
        }
        System.out.println(obj2.toString());

        StringJoiner obj4 = new StringJoiner(", ");
        obj4.setEmptyValue(" : No value in obj2");
        System.out.println("Empty String Joiner" +obj4.toString());
    }
}
