package com.dyb.ObserverPattern;

/**
 * @author dyb
 * @date 2020-01-09 11:14
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.attch(this);
    }
    @Override
    public void update() {
        System.out.println("二进制字符串"+Integer.toBinaryString(subject.getState()));
    }
}
