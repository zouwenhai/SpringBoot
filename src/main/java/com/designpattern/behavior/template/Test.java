package com.designpattern.behavior.template;

/**
 * @ClassName Test
 * @Description 模板模式
 * @Author zouwenhai
 * @Date 2019/6/4 17:59
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test() {
        Game cricket = new Cricket();

        Game football = new Football();

        cricket.play();
        football.play();
    }
}
