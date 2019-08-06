package com.designmodel.delegate;

/**
 * @ClassName A
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/5 11:11
 * @Version 1.0
 */
public class A implements I {

    @Override
    public void f() {

        System.out.println("我是A，工作f");

    }

    @Override
    public void g() {
        System.out.println("我是A，工作g");

    }
}
