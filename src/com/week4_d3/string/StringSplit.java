package com.week4_d3.string;

public class StringSplit {
    public static void main(String[] args) {
        String specification = "Laptop ------- Specification : i7 processor,@@@@ 11th generation, Graphics #### RTX 3050";
        String[] arr = specification.split("-|,|@|#");

        for(String str : arr){
            System.out.print(str);
        }
        System.out.println();
    }
}
