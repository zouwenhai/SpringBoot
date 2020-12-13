package com.designpattern.delegate;

/**
 * @ClassName B
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/5 11:12
 * @Version 1.0
 */
public class B implements I {

    @Override
    public void f() {

        System.out.println("我是B，工作f");
    }

    @Override
    public void g() {
        System.out.println("我是B，工作g");

    }
}
