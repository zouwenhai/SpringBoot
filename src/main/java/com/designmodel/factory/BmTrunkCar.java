package com.designmodel.factory;

/**
 * @ClassName BmTrunkCar
 * @Description 宝马卡车
 * @Author zouwenhai
 * @Date 2019/5/18 20:28
 * @Version 1.0
 */
public class BmTrunkCar implements TrunkCar {
    @Override
    public void produce_trunkCar() {
        System.out.println("生产宝马卡车");
    }
}
