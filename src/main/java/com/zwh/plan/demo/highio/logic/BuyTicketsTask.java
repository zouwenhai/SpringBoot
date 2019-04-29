package com.zwh.plan.demo.highio.logic;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName BuyTicketsTask
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 0:31
 * @Version 1.0
 */
@Slf4j
public class BuyTicketsTask extends Thread {


    @Override
    public void run() {
        log.info(Thread.currentThread().getName());

    }
}
