package com.designmodel.builder;

/**
 * @ClassName DellBuildComputer
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/19 1:20
 * @Version 1.0
 */
public class HsBuildComputer implements BuildComputer {

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("华硕cpu");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("华硕硬盘");

    }

    @Override
    public void buildMainBord() {
        computer.setMainBord("华硕主板");

    }

    @Override
    public Computer buildComputer() {
        return computer;
    }


}
