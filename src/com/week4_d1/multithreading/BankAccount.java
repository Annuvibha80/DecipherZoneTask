package com.week4_d1.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdraw ");
                    try {
                        Thread.sleep(200);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Withdrawal successfull " +balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }


                } else {
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " COULD NOT ACQUIRE THE LOC ");
            }
        } catch (Exception e) {
           Thread.currentThread().interrupt();     //if we dont write this way we loss the control over thread and can't do any thread operation further 😒
        }
    }

}


        /*
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() + "proceeding with withdraw" );
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance-=amount;
        }
        else{
            System.out.println(Thread.currentThread().getName() + "Insufficient balance");
        }

         */


