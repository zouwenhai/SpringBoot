package com.aop;

/**
 * @ClassName HelloImpl
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/7/2 21:27
 * @Version 1.0
 */
public class HelloImpl implements Hello {


    @Override
    public void sayHello(String str) {
        System.out.println("hello "+str);
    }
}
