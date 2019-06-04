package com.zwh.designmodel.template;

/**
 * @ClassName Test
 * @Description TODO
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
