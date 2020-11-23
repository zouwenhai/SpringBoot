package com.process;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName MyLockTest2
 * @Description ReentrantLock 锁
 * @Author zouwenhai
 * @Date 2020/5/17 15:05
 * @Version 1.0
 */
public class MyLockTest2 implements Runnable {


    private ReentrantLock reentrantLock = new ReentrantLock();

    public void get() {
        System.out.println("2 enter thread name-->" + Thread.currentThread().getName());
        reentrantLock.lock();
        System.out.println("3 get thread name-->" + Thread.currentThread().getName());
        set();
        reentrantLock.unlock();
        System.out.println("5 leave run thread name-->" + Thread.currentThread().getName());
    }

    public void set() {
        reentrantLock.lock();
        System.out.println("4 set thread name-->" + Thread.currentThread().getName());
        reentrantLock.unlock();
    }

    @Override
    public void run() {
        System.out.println("1 run thread name-->" + Thread.currentThread().getName());
        get();
    }

    public static void main(String[] args) {
        MyLockTest test = new MyLockTest();
        for (int i = 0; i < 10; i++) {
            new Thread(test, "thread-" + i).start();
        }
    }
}
