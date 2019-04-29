package com.zwh.plan.demo.highio.logic;

import com.zwh.plan.demo.highio.dao.TrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName BuyTicketsLogicImpl
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 0:29
 * @Version 1.0
 */
@Service
public class BuyTicketsLogicImpl implements BuyTicketLogic {

    @Autowired
    private TrainMapper trainMapper;

    @Override
    public Integer queryTicket() {

        return trainMapper.queryCountByNum("001");
    }
}
