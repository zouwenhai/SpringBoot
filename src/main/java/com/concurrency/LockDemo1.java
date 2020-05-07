package com.concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/15 16:02
 * @work //TODO
 */
public class LockDemo1 {


    public static void main(String[] args) {

        //读写锁
        final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        Thread thread = new Thread(() -> {
            lock.writeLock().lock();
            System.out.println("Thread real execute");
            lock.writeLock().unlock();
        });
        lock.writeLock().lock();
        lock.writeLock().lock();
        thread.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("realse one once");
        lock.writeLock().unlock();

    }


}
