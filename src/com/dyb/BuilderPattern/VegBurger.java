package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:18
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public float price() {
        return 5.0F;
    }
}
