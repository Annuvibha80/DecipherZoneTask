package com.week4_d1.multithreading;

public class SyncCounter {
    private int count =0;

    public synchronized  void increment() {
        count ++;
//        synchronized(this){
//            count++;
//        }
    }

    public int getCount(){
        return count;
    }
}
