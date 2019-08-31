package com.designmodel.command;

import lombok.Setter;

/**
 * @ClassName KeyPad
 * @Description 键盘（请求者角色）
 * @Author zouwenhai
 * @Date 2019/8/31 22:20
 * @Version 1.0
 */
@Setter
public class KeyPad {

    private PlayCommand playCommand;


    private StopCommand stopCommand;






    /**
     * 播放请求
     */
    public void play(){
        playCommand.execute();

    }


    /**
     * 停止请求
     */
    public  void Stop(){
        stopCommand.execute();
    }

}
