package com.interview;

/**
 * @ClassName CloseState
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/6/3 20:27
 * @Version 1.0
 */
public class CloseState implements State {


    @Override
    public synchronized void init() throws Exception {
        throw new Exception("Close订单无法初始化");
    }

    @Override
    public synchronized void close() throws Exception {


    }

    @Override
    public synchronized void pending() throws Exception {
        throw new Exception("Close订单无法待定");
    }

    @Override
    public synchronized void success() throws Exception {
        throw new Exception("Close订单无法成功");

    }

    @Override
    public synchronized void refund() throws Exception {
        throw new Exception("Close订单无法拒绝");

    }
}
