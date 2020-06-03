package com.designpattern.create.factory;

import org.junit.Test;

/**
 * @ClassName test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/5/18 1:12
 * @Version 1.0
 */
public class test {

    @Test
    public void tets(){
        //宝马工厂
        CarFactory bmCarFactory = new BmCarFactory();
        bmCarFactory.produceCar().produce_Car();
        bmCarFactory.produceTrunkCar().produce_trunkCar();





    }
}
