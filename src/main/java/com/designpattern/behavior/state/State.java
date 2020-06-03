package com.designpattern.behavior.state;

/**
 * @ClassName State
 * @Description 糖果机状态抽象类
 * @Author zouwenhai
 * @Date 2019/9/8 23:24
 * @Version 1.0
 */
public interface State {


    /**
     * 投币
     */
    void insertCoin();


    /**
     * 退回硬币
     */
    void returnCoin();


    /**
     * 旋转曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */

    void dispense();


    void printState();



}
