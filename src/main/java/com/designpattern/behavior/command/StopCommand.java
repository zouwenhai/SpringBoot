package com.designpattern.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName StopCommand
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/8/31 22:17
 * @Version 1.0
 */
@Slf4j
public class StopCommand implements Command {

    private AudioPlayer audioPlayer;


    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
