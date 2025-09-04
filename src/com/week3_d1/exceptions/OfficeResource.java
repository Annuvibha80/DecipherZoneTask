package com.week3_d1.exceptions;


class Resource extends Exception{
    Resource(){
        super("Not enough resources");
    }
}
public class OfficeResource {
    public static void main(String[] args) throws Resource {
        System.out.println("Value");
        String laptop = null;
        if(laptop == null){
            throw new Resource();
        }
        else{
            System.out.println("entered value : " +laptop);
        }
    }
}


