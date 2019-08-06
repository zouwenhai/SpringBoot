package com.designmodel.observe;

public interface ObserverAble {

     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
