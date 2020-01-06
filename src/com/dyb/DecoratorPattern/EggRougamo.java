package com.dyb.DecoratorPattern;

/**
 * @author dyb
 * @date 2020-01-06 14:56
 */
public class EggRougamo extends Egg {
    public EggRougamo(Rougamo Rougamo) {
        super(Rougamo);
    }
    public void add(){
        System.out.println("加蛋");
    }

    @Override
    public void show(){

        super.show();
        this.add();
    }
}
