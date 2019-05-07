package com.zwh.plan.demo.highio.controller;

import com.zwh.plan.demo.highio.logic.BuyTicketLogic;
import com.zwh.plan.demo.highio.logic.BuyTicketsTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BuyTicketController
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 0:27
 * @Version 1.0
 */
@RestController
@Slf4j
public class BuyTicketController {

    private static final int count = 2000;

    @Autowired
    private BuyTicketLogic buyTicketLogic;


    @RequestMapping("/query")
    public String queryTickets() {

        Integer count = buyTicketLogic.queryTicket();
        return count.toString();
    }

/*    @Test
    public void test1() {

        for (int i = 0; i < count; i++) {
            BuyTicketsTask buyTicketsTask = new BuyTicketsTask();
            buyTicketsTask.start();
        }


    }*/
}
