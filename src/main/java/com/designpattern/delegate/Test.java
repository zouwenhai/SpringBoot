package com.designpattern.delegate;

/**
 * @ClassName Test
 * @Description 委派模式（不属于23种设计模式）
 * @Author zouwenhai
 * @Date 2019/6/5 11:19
 * @Version 1.0
 */
public class Test {

    @org.junit.Test
    public void test(){


        C c = new C();
        c.f();
        c.g();
        //更换委托对象
        c.toB();
        c.g();
        c.f();
    }
}
