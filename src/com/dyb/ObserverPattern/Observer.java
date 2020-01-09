package com.dyb.ObserverPattern;

/**
 * @author dyb
 * @date 2020-01-09 10:53
 * 抽象观察者类
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
