package com.thread;

/**
 * @ClassName VolatileApp
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/3/23 23:15
 * @Version 1.0
 */
public class VolatileApp {


    //volatile
    private static boolean isOver = false;

    private static int number = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isOver) {
                    //Thread.yield();
                }
                System.out.println(number);
            }
        });
        thread.start();
        Thread.sleep(1000);
        number = 50;
        isOver = true;
    }
}
