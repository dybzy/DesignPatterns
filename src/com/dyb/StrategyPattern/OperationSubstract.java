package com.dyb.StrategyPattern;

/**
 * @author dyb
 * @date 2020-01-10 8:59
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
