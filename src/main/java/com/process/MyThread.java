package com.process;

import java.util.concurrent.*;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/9/25 18:09
 * @work //多线程实现方式
 */
public class MyThread {

    /***
     * 固定线程池(newFixedThreadPool)
     * @param nThreads
     * @param threadFactory
     * @return
     */
    public static ExecutorService newFixedThreadPool(int nThreads, ThreadFactory threadFactory) {
        return new ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
    }

    /**
     * 单例线程池(newSingleThreadExecutor)
     *
     * @param threadFactory
     * @return
     */
    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory) {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
    }

    /**
     * 缓存线程池(newCachedThreadPool)
     *
     * @return
     */
    public static ExecutorService newCachedThreadPool() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());
    }


}
