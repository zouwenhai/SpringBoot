package com.designmodel.single;

/**
 * @ClassName Singleton
 * @Description 单例模式(懒汉)
 * @Author zouwenhai
 * @Date 2019/5/12 22:03
 * @Version 1.0
 */
public class Singleton2 {

    /**
     * 将无参构造方法改成私有
     * 外部无法创建
     * 只能通过内部创建
     */
    private Singleton2() {

    }


    private static Singleton2 singleton = null;



    /***
     * 获取单例模式
     * 这种方式只适用于单线程，多线程会出问题。
     * @return
     */
    public static Singleton2 getSingleton() {

        if (singleton == null) {
            singleton = new Singleton2();

        }
        return singleton;
    }

    /**
     * 锁住静态类
     * 加上同步锁，可以保证多线程访问时拿到时同一个对象。
     *
     * @return
     */
    synchronized public static Singleton2 getSingleton1() {
        try {
            Thread.sleep(1000);
            if (singleton == null) {
                singleton = new Singleton2();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }





    /**
     * 这种加锁的位置有问题
     * 每次新的线程进来时暂停1秒，拿到锁，new了一个对象出去，第二个线程进来时同样休息了1秒钟，然后拿到锁之后又new了一个对象出去。
     *
     * @return
     */
    public static Singleton2 getSingleton3() {
        try {
            Thread.sleep(1000);
            if (singleton == null) {
                synchronized (Singleton.class) {
                    singleton = new Singleton2();

                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }


    /**
     * 正确加锁的位置
     *
     * @return
     */
    public static Singleton2 getSingleton4() {
        try {
            synchronized (Singleton.class) {
                Thread.sleep(1000);
                if (singleton == null) {
                    synchronized (Singleton.class) {
                        singleton = new Singleton2();

                    }

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }


}
