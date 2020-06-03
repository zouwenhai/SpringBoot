package com.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SoldState
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/9/8 23:41
 * @Version 1.0
 */
@Slf4j
public class SoldState implements State {

    @Override
    public void insertCoin() {

    }

    @Override
    public void returnCoin() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

        log.info("发放糖果");

    }

    @Override
    public void printState() {

    }
}
