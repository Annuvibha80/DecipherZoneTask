package com.week4_d3.string;

public class StringImmutability {
    private final String value;

    public StringImmutability(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public StringImmutability concat(String add){
        return new StringImmutability (this.value + add);
    }

    public static void main(String[] args) {
        StringImmutability obj1 = new StringImmutability("Hello");
        StringImmutability obj2 = obj1;

        System.out.println("Before change : ");
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj1 = " + obj2.getValue());

        System.out.println("After change : ");
        obj1 = obj1.concat(" world");
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}