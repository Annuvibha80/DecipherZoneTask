package com.week4_d1.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Thread1 Acquired the lock
Thread1 Released the lock
Thread2 Acquired the lock
Thread2 Released the lock
Thread3 Acquired the lock
Thread3 Released the lock
Thread which is approaching first to acquire lock should be given first , like early come early get, but here it is getting random access and that's unfair
so this need to be solved
 */
public class UnfairLock {
    private final Lock unfairLock = new ReentrantLock();

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " Acquired the lock ");
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        finally{
            System.out.println(Thread.currentThread().getName() + " Released the lock ");
            unfairLock.unlock();
        }
    }
}
