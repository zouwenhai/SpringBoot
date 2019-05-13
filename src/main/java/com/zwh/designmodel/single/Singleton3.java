package com.zwh.designmodel.single;

/**
 * @ClassName Singleton
 * @Description 单例模式(懒汉)
 * @Author zouwenhai
 * @Date 2019/5/12 22:03
 * @Version 1.0
 */
public class Singleton3 {

    /**
     * 将无参构造方法改成私有
     * 外部无法创建
     * 只能通过内部创建
     */
    private Singleton3() {

    }

    /**
     * 静态内部类
     * 外部类被加载时，内部类不会被加载，除非主动加载。
     */
    private static class InsideClass {

        private static Singleton3 singleton = new Singleton3();
    }



    public static Singleton3 getInstance(){

        return InsideClass.singleton;

    }

}
