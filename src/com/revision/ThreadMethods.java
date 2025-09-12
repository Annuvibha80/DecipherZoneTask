package com.revision;

public class ThreadMethods extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            }
        }
        catch(Exception e){}
    }
    public static void main(String[] args) {
        ThreadMethods obj = new ThreadMethods();
        obj.start();

        try {
            obj.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ThreadMethods obj2 = new ThreadMethods();
        obj2.start();
    }
}
