package com.dyb.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-09 10:52
 * 主体类
 */
public class Subject {
    private List<Observer> observers=new ArrayList<>();
    private int state;
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state=state;
        notifyAllObservers();

    }
    public void attch(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
