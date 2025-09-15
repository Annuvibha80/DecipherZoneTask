package com.week4_d1.multithreading;

public class ThreadYield extends Thread{
    ThreadYield(String Name){
        super(Name);
    }
    public void run(){
        for(int i=1; i<6; i++){
        System.out.println(Thread.currentThread().getName() +" Running");
        Thread.yield();
        }
    }

    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield("t1");
        ThreadYield t2 = new ThreadYield("t2");
        t1.start();
        t2.start();
    }
}
