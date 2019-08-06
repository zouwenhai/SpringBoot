package com.designmodel.factory;

/**
 * @ClassName BmCarFactory
 * @Description 宝马车工厂
 * @Author zouwenhai
 * @Date 2019/5/18 20:37
 * @Version 1.0
 */
public class BmCarFactory implements CarFactory {

    @Override
    public Car produceCar() {
        return new BmCar();
    }

    @Override
    public TrunkCar produceTrunkCar() {
        return new BmTrunkCar();
    }
}
