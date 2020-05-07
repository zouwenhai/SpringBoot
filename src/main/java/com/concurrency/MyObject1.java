package com.concurrency;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/15 14:21
 * @work //TODO
 */
public class MyObject1 {


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
        MyObject1 myObject1 = new MyObject1();
        Thread thread1 = new Thread(() -> {
            myObject1.method1();
        }, "t1");

        Thread thread2 = new Thread(() -> {
            myObject1.method1();
        }, "t2");

        thread1.start();
        thread2.start();
    }

//打印结果：thread name is [{t1}],time is [{1579070544}]
//          thread name is [{t2}],time is [{1579070548}]
//同一个对象。即同一把锁，所以线程t2在线程t1打印4秒后才会打印。

}
