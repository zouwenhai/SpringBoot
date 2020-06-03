package com.thread;

import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName Demo2
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/2/26 15:47
 * @Version 1.0
 */
public class Demo2 {


    /**
     * 已经被废弃的 suspend()（暂停）、resume()（恢复） 和 stop()（停止）。
     * 废弃原因是，在调用方法之后，线程不会保证占用的资源被正常释放。
     * @param args
     * @throws InterruptedException
     */


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
        //线程暂停
        t.suspend();
        System.out.println("suspend time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);
        //线程恢复
        t.resume();
        System.out.println("resume time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);
        //线程停止
        t.stop();
        System.out.println("stop time = " + System.currentTimeMillis() / 1000);
        TimeUnit.SECONDS.sleep(3);
    }



    @Test
    public void test(){

        Integer a =200;
        Integer b=200;
        System.out.println(a.equals(b));

    }





}
