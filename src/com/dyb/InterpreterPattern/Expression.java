package com.dyb.InterpreterPattern;

/**
 * @author dyb
 * @date 2020-01-08 14:16
 * 抽象表达式类
 */
public interface Expression {
    public boolean interpret(String info);
}
