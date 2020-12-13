package com.designpattern.behavior.command;

import org.junit.Test;

/**
 * 命令模式把发出命令的责任和执行命令的责任分割开，委派给不同的对象
 * @ClassName Client
 * @Description 客户端
 * @Author zouwenhai
 * @Date 2019/8/31 22:23
 * @Version 1.0
 */
public class Client {

    @Test
    public void test(){

        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //创建请求者对象
        KeyPad keypad = new KeyPad();
        keypad.setPlayCommand(playCommand);
        keypad.setStopCommand(stopCommand);
        //测试
        keypad.play();
        keypad.stop();

    }





}
