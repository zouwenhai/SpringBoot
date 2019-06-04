package com.zwh.generic;

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



}
