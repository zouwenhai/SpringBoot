package com.designmodel.single;

/**
 * @ClassName Singleton
 * @Description 单例模式(饿汉式)
 * @Author zouwenhai
 * @Date 2019/5/12 22:03
 * @Version 1.0
 */
public class Singleton {

    /**
     * 将无参构造方法改成私有
     * 外部无法创建
     * 只能通过内部创建
     */
    private Singleton() {

    }


    private static Singleton singleton = null;

    static {
        singleton = new Singleton();
    }


    public static Singleton getSingleton() {
        return singleton;
    }
}
