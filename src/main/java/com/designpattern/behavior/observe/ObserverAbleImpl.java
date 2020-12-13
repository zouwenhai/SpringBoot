package com.designpattern.behavior.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ObserverAbleImpl
 * @Description 被观察者
 * @Author zouwenhai
 * @Date 2019/6/4 1:10
 * @Version 1.0
 */
public class ObserverAbleImpl implements ObserverAble {

    //List集合的泛型参数为接口，设计原则：面向接口编程

    private List<Observer> observers;

    private String msg;

    public ObserverAbleImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        if (!observers.isEmpty())
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer oserver = observers.get(i);
            oserver.updateState(msg);
        }

    }

    public void setInfomation(String s) {
        this.msg = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
