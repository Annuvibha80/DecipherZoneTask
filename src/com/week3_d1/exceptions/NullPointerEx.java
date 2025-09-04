package com.week3_d1.exceptions;

public class NullPointerEx {
    public static void main(String[] args) {
        String s = null;
        //System.out.println(s);
        //System.out.println(s.length());

        //Handle

        try{
            if(s.equals("msi")){
                System.out.println("same");
            }
            else{
                System.out.println("Not same");
            }
        }
        catch(NullPointerException e){
            System.out.println(e.toString());
        }

    }
}
