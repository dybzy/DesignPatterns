package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:20
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
