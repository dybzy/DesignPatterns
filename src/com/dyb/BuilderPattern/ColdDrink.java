package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:17
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
