package com.dyb.ProxyPattern.jdkPP;

/**
 * @author dyb
 * @date 2020-01-07 16:13
 */
public class Text {
    public static void main(String[] args) {
        IDog dog = new GunDog();
        IDog proxy =(IDog) MyProxyFactory.getPrXy(dog);
        proxy.run();
    }
}
