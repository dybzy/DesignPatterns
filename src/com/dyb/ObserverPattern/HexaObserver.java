package com.dyb.ObserverPattern;

/**
 * @author dyb
 * @date 2020-01-09 11:20
 */
public class HexaObserver  extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println( "十六进制字符串: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
