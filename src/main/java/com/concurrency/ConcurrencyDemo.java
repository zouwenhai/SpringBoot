package com.concurrency;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/14 14:44
 * @work //java并发编程demo
 */
public class ConcurrencyDemo {


    public static void main(String[] args) {
        WorkerThread thread = new WorkerThread();

        System.out.printf("work thread daemon: %b\n", thread.isDaemon());
        System.out.printf("main thread daemon: %b\n", Thread.currentThread().isDaemon());
        thread.start();
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread exit");
        //System.exit(0);
    }

}

class WorkerThread extends Thread {
    public WorkerThread() {
        // if true, JVM will quit after main thread quit
        // if false, JVM will not quit, because this workerThread will never end.
        setDaemon(false);
    }

    public void run() {
        for (int i = 0; ; i++) {
            System.out.printf("work thread loop: %d\n", i);
            try {
                sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
