package com.generic;

/**
 * @ClassName GenericClass
 * @Description 泛型类（T、E、K、V表示泛型形参）
 * @Author zouwenhai
 * @Date 2019/5/27 15:11
 * @Version 1.0
 */
public class GenericClass<T> {

    private T data;




    public GenericClass() {
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public  T getWay1(T t){

        return t;
    }


    /**
     * 静态方法就不能用泛型
     * @param t
     * @param <T>
     * @return
     */
   /* public static T getWay2(T t){
        return t;
    }*/


    public static <T> T getWay3(T t){
        return t;
    }


}
