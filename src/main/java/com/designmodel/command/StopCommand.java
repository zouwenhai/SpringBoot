package com.designmodel.command;

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


    @Override
    public void execute() {
        log.info("执行暂停命令");

    }
}
