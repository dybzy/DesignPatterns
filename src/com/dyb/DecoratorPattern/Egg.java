package com.dyb.DecoratorPattern;

/**
 * @author dyb
 * @date 2020-01-06 14:35
 */
public abstract class Egg implements Rougamo {
    private Rougamo name;
    public Egg(Rougamo name){
        this.name=name;
    }
    @Override
    public void show() {
        name.show();
    }
}
