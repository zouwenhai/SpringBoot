package com.process;

/**
 * @ClassName MyLockTest
 * @Description synchronized的特性
 * @Author zouwenhai
 * @Date 2020/5/17 14:44
 * @Version 1.0
 */
public class MyLockTest implements Runnable {


    public synchronized void get() {
        System.out.println("2 enter thread name-->" + Thread.currentThread().getName());
        //reentrantLock.lock();
        System.out.println("3 get thread name-->" + Thread.currentThread().getName());
        //加了一个加锁的set方法
        set();
        //reentrantLock.unlock();
        System.out.println("5 leave run thread name-->" + Thread.currentThread().getName());
    }

    public synchronized void set() {
        //reentrantLock.lock();
        System.out.println("4 set thread name-->" + Thread.currentThread().getName());
        //reentrantLock.unlock();
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

//结论：以上get方法能够成功进入set方法说明synchronzied是一个可重入锁，
// 线程0结束get方法时线程9进入get方法，并没有按照线程执行顺序进行，说明sychronized是一个非公平锁。
// 当线程get方法后，其他线程只能等待说明synchronized是独占锁。
