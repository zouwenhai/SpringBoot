package com.designmodel.command;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description 、客户端
 * @Author zouwenhai
 * @Date 2019/8/31 22:23
 * @Version 1.0
 */
public class Client {

    @Test
    public void test(){

        KeyPad keyPad = new KeyPad();
        keyPad.setPlayCommand(new PlayCommand());
        keyPad.setStopCommand(new StopCommand());
        keyPad.play();
        keyPad.Stop();
    }





}
