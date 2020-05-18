package com.lock;

public class MyLockTest implements Runnable {

    @Override
    public void run() {
        System.out.println("1 run thread name-->" + Thread.currentThread().getName());
        get();
    }


    public synchronized void get() {

        System.out.println("2 enter thread name-->" + Thread.currentThread().getName());
        //reentrantLock.lock();
        System.out.println("3 get thread name-->" + Thread.currentThread().getName());
        set();
        //reentrantLock.unlock();
        System.out.println("5 leave run thread name-->" + Thread.currentThread().getName());
    }


    public synchronized void set() {
        System.out.println("4 set thread name-->" + Thread.currentThread().getName());


    }


    public static void main(String[] args) {
        MyLockTest test = new MyLockTest();
        for (int i = 0; i < 10; i++) {
            new Thread(test, "thread-" + i).start();
        }
    }
//執行結果
//get()方法中顺利进入了set()方法，说明synchronized的确是可重入锁。分析打印Log，thread-0先进入get方法体，这个时候thread-1、thread-2、thread-3等待进入，
// 但当thread-0离开时，thread-2却先进入了方法体，没有按照thread-1、thread-2、thread-3的顺序进入get方法体，
// 说明sychronized的确是非公平锁。而且在一个线程进入get方法体后，
// 其他线程只能等待，无法同时进入，验证了synchronized是独占锁。

}
