package com.dyb.StrategyPattern;

/**
 * @author dyb
 * @date 2020-01-10 9:01
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
