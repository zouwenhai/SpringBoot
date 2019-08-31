package com.designmodel.command;

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

    @Override
    public void execute() {

        log.info("执行播放命令");
    }
}
