package com.week4_d1.multithreading;

public class ThreadInterrupt extends Thread{
    ThreadInterrupt(String Name){
        super(Name);
    }
    public void run(){

        try{
            Thread.sleep(40);
        }
        catch(InterruptedException e){}
    }

    public static void main(String[] args) {
        ThreadInterrupt t1 = new ThreadInterrupt("t1");
        t1.start();
        t1.interrupt();
    }
}
