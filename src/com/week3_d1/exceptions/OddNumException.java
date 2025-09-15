package com.week3_d1.exceptions;
import java.util.Scanner;
public class OddNumException extends Exception{
    OddNumException(){
        super("Your number is odd");
    }
}

class CheckNum{
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            if (a % 2 == 0) {
                throw new OddNumException();
            }
            else{
                System.out.println("Num :" +a);
            }
        }
        catch(OddNumException e){
            //e.printStackTrace();
            System.out.println("Exception details :" + e.getMessage() );
            System.out.println("Exception details :" + e.toString());
        }
    }
}