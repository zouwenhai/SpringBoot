package com.process;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName CountDownLatchTest
 * @Description CountDownLatch的用法
 * @Author zouwenhai
 * @Date 2020/5/17 13:54
 * @Version 1.0
 */
public class CountDownLatchTest {


    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        final CountDownLatch latch = new CountDownLatch(3);

        for (int i = 0; i < 3; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {

                    try {
                        System.out.println("子线程" + Thread.currentThread().getName() + "开始执行");
                        Thread.sleep((long) (Math.random() * 10000));
                        System.out.println("子线程" + Thread.currentThread().getName() + "执行完成");
                        latch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            //执行线程
            executorService.execute(runnable);
        }
        try {
            System.out.println("主线程" + Thread.currentThread().getName() + "等待子线程执行完成...");
            latch.await();//阻塞当前线程，直到计数器的值为0
            System.out.println("主线程" + Thread.currentThread().getName() + "开始执行...");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
