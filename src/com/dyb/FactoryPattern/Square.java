package com.dyb.FactoryPattern;

/**
 * @author dyb
 * @date 2020-01-02 14:35
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我是庶出实现类");
    }
}
