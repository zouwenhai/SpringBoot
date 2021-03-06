package com.designpattern.create.builder;

/**
 * @ClassName Test
 * @Description 建造者模式
 * @Author zouwenhai
 * @Date 2019/5/19 1:25
 * @Version 1.0
 */
public class Test {

    @org.junit.Test
    public void test(){

        Computer computer = Director.constructor(new DellBuildComputer());
        System.out.println(computer.toString());
        Computer computer1 = Director.constructor(new HsBuildComputer());
        System.out.println(computer1.toString());

    }

}
