package com.zwh.highio;

import org.junit.Test;

import java.util.UUID;
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


    public static void main(String[] args) {
        int number = 100;


        CountDownLatch countDownLatch = new CountDownLatch(number);

        //线程池
        ExecutorService exec = Executors.newFixedThreadPool(number);

        for (int i = 0; i < number; i++) {

        }


        for (int i = 0; i < number; i++) {

            new Thread() {
                @Override
                public void run() {
                    try {

                        System.out.println("-------------");
                        countDownLatch.await();
                        System.out.println(Thread.currentThread().getName());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }.start();
            countDownLatch.countDown();

        }
    }

}




