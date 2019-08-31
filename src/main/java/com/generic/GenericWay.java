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





    public static  <T>  T  getWay1(T t){

        return t;
    }


   /* public <K>  K  getWay1(K k1,K k2){

      *//*  K k = (K)(k1*k2);*//*
        return k;
    }*/


}
