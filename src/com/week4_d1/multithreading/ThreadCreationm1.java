package com.week4_d1.multithreading;

public class ThreadCreationm1 extends Thread {
    public void run(){
        System.out.println("Hello");
    }


public static void main(String[] args) {
    ThreadCreationm1 obj = new ThreadCreationm1();
    obj.start();
}
}