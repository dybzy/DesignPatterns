package com.dyb.DecoratorPattern;

/**
 * @author dyb
 * @date 2020-01-06 15:01
 */
public class Test {
    public static void main(String[] args) {

        Rougamo rougamo=new EggRougamo(new SimpleRougamo());
        rougamo.show();
    }
}
