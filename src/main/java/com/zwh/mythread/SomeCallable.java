package com.zwh.mythread;

import java.util.concurrent.Callable;

/**
 * @ClassName SomeCallable
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/3 20:02
 * @Version 1.0
 */
public class SomeCallable<V> implements Callable<V> {

    @Override
    public V call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return null;
    }
}
