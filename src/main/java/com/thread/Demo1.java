package com.thread;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/2/26 15:00
 * @Version 1.0
 */
public class Demo1 {





    public static void main(String[] args){

        Object object = new Object();
        Thread t1 = new Thread(()->{

            try {
                TimeUnit.SECONDS.sleep(1L);
                synchronized (object){
                    System.out.println("t1 start object.wait(), time = " + System.currentTimeMillis() / 1000);
                    object.wait();
                    System.out.println("t1 after object.wait(), time = " + System.currentTimeMillis() / 1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(5);
                synchronized (object) {
                    System.out.println("t2 start object.notify(), time = " + System.currentTimeMillis() / 1000);
                    object.notify();
                    System.out.println("t2 after object.notify(), time = " + System.currentTimeMillis() / 1000);
                }

                synchronized (object) {
                    System.out.println("t2  hold lock again, time = " + System.currentTimeMillis() / 1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        t1.start();
        t2.start();

    }







}
