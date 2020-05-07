package com.concurrency;

import java.util.concurrent.locks.Lock;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/15 14:46
 * @work //synchronized关键字锁
 */
public class MyObject2 {

    private synchronized void method1() {


        System.out.println(String.format("thread name is [{%s}],time is [{%s}]", Thread.currentThread().getName(), System.currentTimeMillis() / 1000));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void method2() {
        System.out.println(Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        MyObject2 myObject1 = new MyObject2();
        MyObject2 myObject2 = new MyObject2();
        Thread thread1 = new Thread(() -> {
            myObject1.method1();
        }, "t1");

        Thread thread2 = new Thread(() -> {
            myObject2.method1();
        }, "t2");

        thread1.start();
        thread2.start();
    }

    //输出结果：thread name is [{t2}],time is [{1579070906}]
    //          thread name is [{t1}],time is [{1579070906}]
    //因为是两个对象，两把锁，所以是同步输出。


}
