package com.designmodel.observe;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zouwenhai
 * @Date 2019/6/4 13:20
 * @Version 1.0
 */
public class Test {


    @org.junit.Test
    public void test(){

        //被观察者
        ObserverAbleImpl observerableImpl = new ObserverAbleImpl();


        Observer user1 = new User("张三");
        Observer user2 = new User("李四");
        Observer user3 = new User("王五");
        observerableImpl.registerObserver(user1);
        observerableImpl.registerObserver(user2);
        observerableImpl.registerObserver(user3);
        observerableImpl.setInfomation("java是世界上最好的语言");
        System.out.println("-----------------------");
        observerableImpl.removeObserver(user1);
        observerableImpl.setInfomation("java是世界上最好的语言");

    }
}
