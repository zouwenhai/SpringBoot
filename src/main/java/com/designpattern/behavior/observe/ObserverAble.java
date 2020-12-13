package com.designpattern.behavior.observe;

public interface ObserverAble {

     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}
