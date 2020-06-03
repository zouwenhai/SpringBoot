package com.designpattern.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName PlayCommand
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/8/31 22:16
 * @Version 1.0
 */
@Slf4j
public class PlayCommand implements Command {

    /**
     *命令接收者
     */
    private AudioPlayer audioPlayer;


    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {


        audioPlayer.play();
    }
}
