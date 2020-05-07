package com.lock;

import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/5/6 15:36
 * @work //java锁的用法
 */
public class LockTest {

    private static Lock lock = new ReentrantLock();

    synchronized void setA() throws Exception {

        Thread.sleep(1000);
        setB();
    }

    synchronized void setB() throws Exception {
        Thread.sleep(1000);
    }


    @Test
    public void test1() {

        try {
            setA();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void get(Thread thread) {
        System.out.println(thread.getName() + "进来");

    }


    public void test2() {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                get(Thread.currentThread());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                get(Thread.currentThread());
            }
        });

    }

}



