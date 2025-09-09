package com.week4_d1.multithreading;

public class UnfairLockMain {

    public static void main(String[] args) {
        UnfairLock obj = new UnfairLock();
        Runnable task = new Runnable(){
            public void run(){
                obj.accessResource();
            }
        };

        Thread t1 = new Thread(task , "Thread1");
        Thread t2 = new Thread(task , "Thread2");
        Thread t3 = new Thread(task , "Thread3");

        t1.start();
        t2.start();
        t3.start();
    }

}
