package com.designpattern.behavior.command;

/**
 * @ClassName AudioPlayer
 * @Description 接收者（录音机扮演）
 * @Author zouwenhai
 * @Date 2019/9/8 22:18
 * @Version 1.0
 */
public class AudioPlayer {


    public void play(){
        System.out.println("播放。。。");
    }

    public void stop(){
        System.out.println("停止。。。");
    }
}
