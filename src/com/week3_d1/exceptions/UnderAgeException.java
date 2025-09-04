package com.week3_d1.exceptions;

/*
Checked Custom Exception
Create a compile time custom exception -= UnderAge exception which can be used in any class to throw exception
 */
class UnderAgeException extends Exception{
   public UnderAgeException(){
       super("You ar under age");
   }

    public UnderAgeException(String message){
        super(message);
    }

}


class Voting{
    public static void main(String[] args) {
        int age = 14;
        try {
            if (age < 18) {
                throw new UnderAgeException();
            }
            else{
                System.out.println("You can vote");
            }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }
    }
}