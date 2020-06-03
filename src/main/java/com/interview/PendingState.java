package com.interview;

/**
 * @ClassName PendingState
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/6/3 20:28
 * @Version 1.0
 */
public class PendingState implements State {

    @Override
    public synchronized void init() {
        System.out.println("PENDING订单初始化");
    }

    @Override
    public synchronized void close() throws Exception {

        throw new Exception("PENDING订单无法关闭");
    }

    @Override
    public synchronized void pending() throws Exception {
    }

    @Override
    public synchronized void success() throws Exception {
        System.out.println("PENDING订单成功");
    }

    @Override
    public synchronized void refund() throws Exception {
        System.out.println("PENDING订单拒绝");

    }
}
