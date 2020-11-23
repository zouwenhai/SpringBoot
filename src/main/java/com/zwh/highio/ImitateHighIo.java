package com.zwh.highio;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ImitateHighIo
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/5 16:57
 * @Version 1.0
 */
public class ImitateHighIo {


    /**
     * 模拟高并发
     * 子线程在执行前首先等待，等countDownLatch计数器变为0时同时执行
     *
     * @param args
     */

    public static void main(String[] args) {
        int number = 100;


        CountDownLatch countDownLatch = new CountDownLatch(100);

        //线程池
        ExecutorService exec = Executors.newFixedThreadPool(number);

        for (int i = 0; i < number; i++) {

        }


        for (int i = 0; i < number; i++) {

            new Thread() {
                @Override
                public void run() {
                    try {

                        countDownLatch.await();
                        System.out.println(Thread.currentThread().getName());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }.start();
            countDownLatch.countDown();
        }
        System.out.println("主线程开始执行");
    }

}




