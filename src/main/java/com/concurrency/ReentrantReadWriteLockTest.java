package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/15 16:46
 * @work //TODO
 */
public class ReentrantReadWriteLockTest {

    private static Lock lock = new ReentrantLock();

    public synchronized static void get(Thread thread) {
        System.out.println("start time:" + System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + ":正在进行读操作……");
        }
        System.out.println(thread.getName() + ":读操作完毕！");
        System.out.println("end time:" + System.currentTimeMillis());
    }


    public static void get2(Thread thread) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        lock.readLock().lock();
        System.out.println("start time:" + System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + ":正在进行读操作……");
        }
        System.out.println(thread.getName() + ":读操作完毕！");
        System.out.println("end time:" + System.currentTimeMillis());
        lock.readLock().unlock();
    }


    public static void get3(Thread thread) {
        System.out.println("start time:" + System.currentTimeMillis());
        boolean flag = lock.tryLock();
        try {
            if (flag) {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(thread.getName() + ":正在进行读操作……");
                }
                System.out.println(thread.getName() + ":读操作完毕！");
                System.out.println("end time:" + System.currentTimeMillis());
            } else {
                System.out.println("系统繁忙");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (flag) {
                lock.unlock();
            }
        }

    }


    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // get(Thread.currentThread());
                // get2(Thread.currentThread());
                get3(Thread.currentThread());

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //get(Thread.currentThread());
                //get2(Thread.currentThread());
                get3(Thread.currentThread());

            }
        }).start();
    }


    //结论
    //synchronized 方法输出结果
    // start time:1579078074396
    //Thread-0:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-0:读操作完毕！
    //end time:1579078074507
    //start time:1579078074507
    //Thread-1:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-1:读操作完毕！
    //end time:1579078074613

    // 用读锁 lock.readLock().lock();输出结果：
    // start time:1579078389295
    //start time:1579078389295
    //Thread-1:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-0:正在进行读操作……
    //Thread-1:正在进行读操作……
    //Thread-1:读操作完毕！
    //Thread-0:读操作完毕！
    //end time:1579078389410
    //end time:1579078389410

    //结论：ReetrantReadWriteLock读锁使用共享模式，同时可以有多个线程并发地读数据,读取操作是同时步执行的，时间节省了100ms,
    // ReetrantReadWriteLock的效率明显高于Synchronized关键字。

}
