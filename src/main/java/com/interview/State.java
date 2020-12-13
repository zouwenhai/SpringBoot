package com.interview;

/**
 * @ClassName State
 * @Description TODO
 * @Author zouwenhai
 * @Date 2020/6/3 20:15
 * @Version 1.0
 */
public interface State {


    /**
     * 订单初始化
     */
    void init() throws Exception;

    /**
     * 订单关闭
     */
    void close() throws Exception;


    /**
     * 订单准备
     */
    void pending() throws Exception;


    /**
     * 订单成功
     */
    void success() throws Exception;


    /**
     * 订单拒绝
     */
    void refund() throws Exception;


}
