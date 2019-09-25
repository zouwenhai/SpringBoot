package com.generic;

/**
 * @ClassName GenericWay
 * @Description 泛型方法
 * @Author zouwenhai
 * @Date 2019/5/27 15:19
 * @Version 1.0
 */
public class GenericWay {

    /**
     * 泛型方法
     *
     * @param c
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        T t = c.newInstance();
        return t;
    }


    /**
     * 有返回值的
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> T getWay1(T t) {

        return t;
    }

    /**
     * 无返回值的
     *
     * @param t1
     * @param <T>
     */
    public <T> void getWay2(T t1) {


    }


    /* public <K>  K  getWay1(K k1,K k2){

     *//*  K k = (K)(k1*k2);*//*
        return k;
    }*/


}
