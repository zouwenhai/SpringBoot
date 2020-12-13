package com.interview;

/**
 * @ClassName InitState
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/6/3 20:20
 * @Version 1.0
 */
public class InitState implements State {


    @Override
    public synchronized void init() throws Exception {

    }

    @Override
    public synchronized void close() throws Exception {


        System.out.println("初始化订单关闭");
    }

    @Override
    public synchronized void pending() throws Exception {
        System.out.println("初始化订单待定");
    }

    @Override
    public synchronized void success() throws Exception {
        throw new Exception("初始化订单无法成功");

    }

    @Override
    public synchronized void refund() throws Exception {
        throw new Exception("初始化订单无法拒绝");

    }
}
