package com.week4_d1.multithreading;

public class SyncCountMain {
    public static void main(String[] args) throws InterruptedException {
        SyncCounter obj = new SyncCounter();
        SyncCountThread t1 = new SyncCountThread(obj);
        SyncCountThread t2 = new SyncCountThread(obj);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch(Exception e){

        }
        System.out.println(obj.getCount());
    }
}
