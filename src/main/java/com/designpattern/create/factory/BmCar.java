package com.designpattern.create.factory;

/**
 * @ClassName BmCar
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/18 20:29
 * @Version 1.0
 */
public class BmCar implements Car {

    @Override
    public void produce_Car() {
        System.out.println("生产宝马汽车");
    }
}
