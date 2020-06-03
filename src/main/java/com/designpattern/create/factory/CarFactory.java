package com.designpattern.create.factory;


/**
 * 抽象工厂模式
 */
public interface CarFactory {


    /**
     *生产汽车
     * @return
     */
    Car produceCar();

    /**
     * 生产卡车
     * @return
     */
    TrunkCar produceTrunkCar();








}
