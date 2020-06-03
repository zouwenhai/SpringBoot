package com.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName OnReadyState
 * @Description 准备状态
 * @Author zouwenhai
 * @Date 2019/9/8 23:30
 * @Version 1.0
 */
@Slf4j
public class OnReadyState implements State {


    @Override
    public void insertCoin() {

        log.error("当前状态不能投入硬币");

    }

    @Override
    public void returnCoin() {

        log.info("退回硬币成功");


    }

    @Override
    public void turnCrank() {

        log.error("转动曲柄");
    }

    @Override
    public void dispense() {

        log.error("当前状态不能发放糖果");
    }

    @Override
    public void printState() {

    }
}
