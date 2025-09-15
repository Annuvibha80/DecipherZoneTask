package com.week3_d1.exceptions;
import java.util.Scanner;

/*Write a Java program to create a method that takes a string as input
 and throws an exception if the string does not contain vowels.
 */

public class StringException extends RuntimeException{
    StringException(){
        super("Exception : String does not contain vowels");
    }
}

class CheckVowels{

    public void s1() {
        System.out.println("Enter your text");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        try {
                if (str.contains( "a") || str.contains("e") || str.contains("i")  || str.contains("o") || str.contains("u")) {
                    System.out.println(str + " contains vowels");
                }
                else {
                    throw new StringException();
                }

        } catch (StringException e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        CheckVowels obj = new  CheckVowels();
        obj.s1();
    }

}


