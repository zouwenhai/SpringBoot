package com.aop;

/**
 * @ClassName DynaTest
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/2 21:24
 * @Version 1.0
 */
public class DynaTest {


    public static void main (String args[]){


        Hello hello = (Hello) new DynaProxyHello().bind(new HelloImpl());//如果我们需要日志功能，则使用代理类
             //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
                hello.sayHello("明天");
    }
}
