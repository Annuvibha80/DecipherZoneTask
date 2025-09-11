package com.week4_d3.string;

import java.util.Arrays;

public class StringToByteArr {
    public static void main(String[] args) {
        String str = "Annuvibha";
        byte[] arr = str.getBytes();

        System.out.println("string to byte array : " + Arrays.toString(arr));
    }
}
