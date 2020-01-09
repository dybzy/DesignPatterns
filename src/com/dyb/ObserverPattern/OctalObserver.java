package com.dyb.ObserverPattern;

/**
 * @author dyb
 * @date 2020-01-09 11:19
 */
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println( "八进制字符串: "
                + Integer.toOctalString( subject.getState() ) );
    }
}