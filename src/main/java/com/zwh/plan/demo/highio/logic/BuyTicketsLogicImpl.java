package com.zwh.plan.demo.highio.logic;

import org.springframework.stereotype.Component;

/**
 * @ClassName BuyTicketsLogicImpl
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/4/27 0:29
 * @Version 1.0
 */
@Component(value = "buyTicketLogic")
public class BuyTicketsLogicImpl implements BuyTicketLogic {

   /* @Autowired
    private TrainMapper trainMapper;
*/
    @Override
    public Integer queryTicket() {

        return 1;
        //return trainMapper.queryCountByNum("001");
    }
}
