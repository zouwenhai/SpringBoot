package com.zwh.designmodel.observe;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName User
 * @Description 具体观察者
 * @Author zouwenhai
 * @Date 2019/6/4 1:08
 * @Version 1.0
 */
@Slf4j
public class User implements Observer {


    private String name;
    private String msg;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void updateState(String msg) {

        this.msg = msg;
        read();

    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + msg);
    }
}
