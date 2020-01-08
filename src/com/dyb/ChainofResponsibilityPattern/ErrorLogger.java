package com.dyb.ChainofResponsibilityPattern;

/**
 * @author dyb
 * @date 2020-01-07 17:22
 */
public class ErrorLogger  extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("错误日志信息3: " + message);
    }
}
