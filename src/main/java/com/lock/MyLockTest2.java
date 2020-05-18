package com.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyLockTest2 implements Runnable {

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        System.out.println("1 run thread name-->" + Thread.currentThread().getName());
        get();

    }

    public void get() {

        System.out.println("2 enter thread name-->" + Thread.currentThread().getName());
        lock.lock();
        System.out.println("3 get thread name-->" + Thread.currentThread().getName());
        set();
        lock.unlock();
        System.out.println("5 leave run thread name-->" + Thread.currentThread().getName());
    }


    public void set() {
        lock.lock();
        System.out.println("4 set thread name-->" + Thread.currentThread().getName());
        lock.unlock();


    }


    public static void main(String[] args) {
        MyLockTest test = new MyLockTest();
        for (int i = 0; i < 10; i++) {
            new Thread(test, "thread-" + i).start();
        }
    }



}
