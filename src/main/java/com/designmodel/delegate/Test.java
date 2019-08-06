package com.designmodel.delegate;

/**
 * @ClassName Test
 * @Description TODO
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
