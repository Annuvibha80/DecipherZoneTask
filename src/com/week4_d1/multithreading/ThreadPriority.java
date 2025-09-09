package com.week4_d1.multithreading;

public class ThreadPriority extends Thread{

    public ThreadPriority(String Name) {
        super(Name);
    }

    public void run(){
        for(int i=1; i<6; i++){
            System.out.println(Thread.currentThread().getName() + "- Priority: " +Thread.currentThread().getPriority() +" Count : " + i);

            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }

    public static void main(String[] args) {
        ThreadPriority obj = new ThreadPriority("obj");
        ThreadPriority obj2 = new ThreadPriority("obj2");
        ThreadPriority obj3 = new ThreadPriority("obj3");

        obj.setPriority(Thread.MIN_PRIORITY);
        obj2.setPriority(Thread.NORM_PRIORITY);
        obj3.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj2.start();
        obj3.start();

    }
}
