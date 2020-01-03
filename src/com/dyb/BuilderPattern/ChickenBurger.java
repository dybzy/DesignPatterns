package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:19
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
