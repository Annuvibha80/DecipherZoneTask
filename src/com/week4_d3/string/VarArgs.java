package com.week4_d3.string;

public class VarArgs {
    int x = 0;
    int m1(int...numbers){
    for(int i: numbers){
        x += i;
    }
    return x;
    }
    public static void main(String[] args) {
    VarArgs obj = new VarArgs();
        System.out.println(obj.m1(new int[]{10, 20, 30}));
    }
}
