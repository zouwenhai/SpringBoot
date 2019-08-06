package com.designmodel.builder;

/**
 * @ClassName Director
 * @Description 构建者
 * @Author zouwenhai
 * @Date 2019/5/19 1:23
 * @Version 1.0
 */
public class Director {


    public static Computer constructor(BuildComputer buildComputer) {

       buildComputer.buildCpu();
       buildComputer.buildHardDisk();
       buildComputer.buildMainBord();
       return buildComputer.buildComputer();

    }
}
