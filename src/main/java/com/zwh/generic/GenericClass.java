package com.zwh.generic;

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
}
