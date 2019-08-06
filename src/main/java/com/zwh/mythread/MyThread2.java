package com.zwh.mythread;

/**
 * @ClassName MyThread2
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/3 19:56
 * @Version 1.0
 */
public class MyThread2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
