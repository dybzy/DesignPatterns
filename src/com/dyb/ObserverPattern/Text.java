package com.dyb.ObserverPattern;

/**
 * @author dyb
 * @date 2020-01-09 11:21
 */
public class Text {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("第一个状态变化: 15");
        subject.setState(15);
        System.out.println("第二种状态变化: 10");
        subject.setState(10);
    }
}
