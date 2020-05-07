package com.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/15 9:51
 * @work //TODO
 */
public class ConCurrencyDemo3 {


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println("time = " + System.currentTimeMillis() / 1000);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);
        t.start();
        TimeUnit.SECONDS.sleep(3);

        //暂停
        t.suspend();
        System.out.println("suspend time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);

        //恢复
        t.resume();
        System.out.println("resume time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);

        //停止
        t.stop();
        System.out.println("stop time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);
    }
}
