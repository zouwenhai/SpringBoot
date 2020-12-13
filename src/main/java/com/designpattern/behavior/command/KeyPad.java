package com.designpattern.behavior.command;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName KeyPad
 * @Description 键盘（请求者角色）
 * @Author zouwenhai
 * @Date 2019/8/31 22:20
 * @Version 1.0
 */
@Setter
@Getter
public class KeyPad {

    private Command playCommand;
    private Command stopCommand;





    /**
     * 播放请求
     */
    public void play(){
        playCommand.execute();

    }


    /**
     * 停止请求
     */
    public  void stop(){
        stopCommand.execute();
    }

}
