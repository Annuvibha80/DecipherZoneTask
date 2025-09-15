package com.week4_d1.multithreading;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount hdfc = new BankAccount();
        Runnable task = new Runnable(){
            public void run(){
               hdfc.withdraw(40);
            }
        };

        Thread t1 = new Thread(task,  "Thread1" );
        Thread t2 = new Thread(task,  "Thread2" );

        t1.start();
        t2.start();
    }
}
