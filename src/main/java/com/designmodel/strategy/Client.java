package com.designmodel.strategy;

/**
 * @ClassName Client
 * @Description 客户端调用
 * @Author zouwenhai
 * @Date 2019/6/4 14:24
 * @Version 1.0
 */
public class Client {

    public static void  main(String[] args){

        Strategy strategy1 = new ConcreateStrategy1();
        //
        StrategyContext strategyContext = new StrategyContext(strategy1);
        //
        strategyContext.contextMethod();


    }
}
