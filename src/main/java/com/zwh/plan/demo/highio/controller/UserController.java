package com.zwh.plan.demo.highio.controller;

import com.zwh.plan.demo.highio.entity.TrainTicketEntity;
import com.zwh.plan.demo.highio.entity.User;
import com.zwh.plan.demo.highio.mapper.TrainTicketMapper;
import com.zwh.plan.demo.highio.mapper.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/7 19:58
 * @Version 1.0
 */
@RestController
public class UserController {



    @Resource
    private UserMapper userMapper;

    @Resource
    private TrainTicketMapper trainTicketMapper;
    
    @RequestMapping(path = { "/queryUser" })
    public String HelloSpring() {

        List<User> userList  = userMapper.queryUserList();
        for (User user : userList){
            System.out.println(user.getUsername());
        }
       TrainTicketEntity trainTicketEntity = trainTicketMapper.quertTicketCount("001");
        return  trainTicketEntity.getCount()+"张车票";
    }
}
