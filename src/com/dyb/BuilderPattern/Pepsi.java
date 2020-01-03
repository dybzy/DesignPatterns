package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:22
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
