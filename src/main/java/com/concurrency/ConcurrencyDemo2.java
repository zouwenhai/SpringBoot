package com.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/14 16:00
 * @work //TODO
 */
public class ConcurrencyDemo2 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            int i = 1;
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println("time = " + System.currentTimeMillis() / 1000 + ", i = " + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1");


        Thread t2 = new Thread(() -> {
            int i = 1;
            while (true) {
                i++;
            }
        }, "t2");

        //设置为守护（daemon） 线程 并启动
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        //让t1 t2 运行3s
        TimeUnit.SECONDS.sleep(3);

        //中断线程
        t1.interrupt();
        t2.interrupt();
        //获取中断状态
        System.out.println("time = " + System.currentTimeMillis() / 1000 + ", t1.isInterrupted() = " + t1.isInterrupted());
        System.out.println("time = " + System.currentTimeMillis() / 1000 + ", t2.isInterrupted() = " + t2.isInterrupted());
        //防止 t1 t2 立即退出
        TimeUnit.SECONDS.sleep(15);
    }
}
