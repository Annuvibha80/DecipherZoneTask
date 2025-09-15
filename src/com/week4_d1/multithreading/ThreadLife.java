package com.week4_d1.multithreading;

public class ThreadLife extends Thread{
    public void run(){
        System.out.println("Butterfly 🦋");
        System.out.println("Running");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
        }
    }


    public static void main(String[] args) {
        ThreadLife t1 = new ThreadLife();
    t1.start();
        System.out.println(t1.getState());
        try {
            Thread.sleep(200);
        }
        catch(InterruptedException e){
        }
        System.out.println(t1.getState());

        try {
            t1.join();
        }
        catch(InterruptedException e){}
        System.out.println(t1.getState());
    }
}
