package com.zwh.designmodel.prototype;

/**
 * @ClassName ConcreteResume
 * @Description
 * @Author zouwenhai
 * @Date 2019/5/19 16:05
 * @Version 1.0
 */
public class ConcreteResume implements Resume2{

    @Override
    public Resume2 clone() {
        return new ConcreteResume();
    }
}
