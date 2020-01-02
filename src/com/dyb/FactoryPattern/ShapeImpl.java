package com.dyb.FactoryPattern;

/**
 * @author dyb
 * @date 2020-01-02 14:32
 */
public class ShapeImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("我是嫡出实现类");
    }
}
