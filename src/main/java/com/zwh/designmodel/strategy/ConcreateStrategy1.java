package com.zwh.designmodel.strategy;

/**
 * @ClassName ConcreateStrategy1
 * @Description 实现1
 * @Author zouwenhai
 * @Date 2019/6/4 14:12
 * @Version 1.0
 */
public class ConcreateStrategy1 implements Strategy {

    @Override
    public void algorithmMethod() {
        System.out.println("新客户不打折");

    }
}
