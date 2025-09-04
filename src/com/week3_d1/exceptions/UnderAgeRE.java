package com.week3_d1.exceptions;
/*
This program displys the cust Unchecked/ Runtime exception
 */

public class UnderAgeRE extends RuntimeException{
    UnderAgeRE(){
    super("Your gender: female  |  age: <18   can not marry ");
    }

    UnderAgeRE(String  message){
        super(message);
    }
}

class Marriage{
    public static void main(String[] args) {
        int age =16;
        String gender = "female";

        try{
            if(age<18 && gender=="female"){
                throw new  UnderAgeRE();
            }
            else{
                System.out.println("OMG");
            }
        }
        catch(UnderAgeRE e){
            e.printStackTrace();
        }

    }
}