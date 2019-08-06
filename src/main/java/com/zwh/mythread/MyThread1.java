package com.zwh.mythread;

/**
 * @ClassName MyThread1
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/3 19:53
 * @Version 1.0
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
       System.out.println(Thread.currentThread().getName());
    }
}
