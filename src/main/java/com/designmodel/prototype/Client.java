package com.designmodel.prototype;

/**
 * @ClassName Client
 * @Description 模拟克隆模式
 * @Author zouwenhai
 * @Date 2019/5/19 17:01
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args){

        //原型
        Resume2 concreteResume = new ConcreteResume();
        //克隆方式(只是隐藏了new)
        Resume2 resume2 = concreteResume.clone();
        concreteResume.clone();
        concreteResume.clone();
    }


}
