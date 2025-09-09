package com.week4_d1.multithreading;

public class SyncCountThread extends Thread{
    private SyncCounter counter;

    public SyncCountThread(SyncCounter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
       for(int i=1; i<1001; i++){
           counter.increment();
       }
    }
}
