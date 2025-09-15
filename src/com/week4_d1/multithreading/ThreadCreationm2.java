package com.week4_d1.multithreading;

public class ThreadCreationm2 implements Runnable{
    public void run(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
//        ThreadCreationm2 obj = new ThreadCreationm2()
//                Thread t1 = new Thread(obj);

        Thread t2 = new Thread(new ThreadCreationm2());
        t2.start();
    }
}
