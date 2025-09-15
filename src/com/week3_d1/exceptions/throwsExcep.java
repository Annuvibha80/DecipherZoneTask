package com.week3_d1.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
//It includes throws exception example



public class throwsExcep {
static int a;
static int b;
   public static int devide() throws ArithmeticException , InputMismatchException{
       System.out.println("Enter value of a:");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();

       System.out.println("Enter value of b:");
       b = sc.nextInt();

       if (b == 0) {
           throw new ArithmeticException("Division by zero is not allowed.");
       }
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        try{
        int devisionResult = devide();
            System.out.println("Result :" + devisionResult );
        }

        catch(ArithmeticException e){
            System.out.println(e.toString());
        }

        catch(InputMismatchException e){
            System.out.println(e.toString());
        }

        finally{
            System.out.println("Exit !");
        }
    }
}
