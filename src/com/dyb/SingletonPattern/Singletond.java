package com.dyb.SingletonPattern;

/**
 * @author dyb
 * @date 2020-01-03 9:25
 * 登记式/静态内部类
 */
public class Singletond {
    private static class SingletonHolder {
        private static final Singletond INSTANCE = new Singletond();
    }
    private Singletond (){}
    public static final Singletond getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
