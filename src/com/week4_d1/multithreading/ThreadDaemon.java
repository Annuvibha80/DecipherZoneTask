package com.week4_d1.multithreading;

//Daemon Thread
//daemon threads are bg threads , jvm does not wait for this to finish
public class ThreadDaemon extends Thread {
    public void run(){
        while(true){
            System.out.println("Hello world !");
        }
    }

    public static void main(String[] args) {
        ThreadDaemon obj = new ThreadDaemon();
        obj.setDaemon(true);
        obj.start();
        System.out.println("Main Done");
    }
}
