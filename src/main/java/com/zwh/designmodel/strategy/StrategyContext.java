package com.zwh.designmodel.strategy;

/**
 * @ClassName StrategyContext
 * @Description 策略模式上下文
 * @Author zouwenhai
 * @Date 2019/6/4 14:16
 * @Version 1.0
 */
public class StrategyContext {

    //持有一个策略实现的引用
    private Strategy strategy;


    //使用构造器构造具体的实现类
    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod() {
        //调用策略实现的方法
        strategy.algorithmMethod();
    }


}
