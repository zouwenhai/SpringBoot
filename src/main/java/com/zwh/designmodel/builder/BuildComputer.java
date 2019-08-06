package com.zwh.designmodel.builder;

/**
 * @ClassName BuildComputer
 * @Description  建造者模式(组装电脑)
 * @Author zouwenhai
 * @Date 2019/5/19 1:13
 * @Version 1.0
 */
public interface BuildComputer {


     void buildCpu();

     void buildHardDisk();


     void buildMainBord();


     Computer buildComputer();








}