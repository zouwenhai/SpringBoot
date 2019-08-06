package com.designmodel.builder;

/**
 * @ClassName Computer
 * @Description 电脑产品
 * @Author zouwenhai
 * @Date 2019/5/19 1:14
 * @Version 1.0
 */
public class Computer {

    //cpu
    private String cpu;

    //硬盘
    private String hardDisk;

    //主板
    private String mainBord;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getMainBord() {
        return mainBord;
    }

    public void setMainBord(String mainBord) {
        this.mainBord = mainBord;
    }

    @Override
    public String toString() {
        return "{cpu:" + cpu + ";mainBord:" +
                mainBord +
                ";hardDisk:" + mainBord + "}";
    }



}
