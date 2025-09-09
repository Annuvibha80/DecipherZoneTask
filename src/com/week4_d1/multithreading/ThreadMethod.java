package com.week4_d1.multithreading;

//start, run, sleep, join
public class ThreadMethod extends Thread {
    public void run(){
        for(int i=1; i<4; i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
    ThreadMethod obj = new ThreadMethod();
    obj.start();
    obj.join();
        System.out.println("Hi");
    }
}
