package com.dyb.ChainofResponsibilityPattern;

/**
 * @author dyb
 * @date 2020-01-07 17:03
 * 扩展了该记录器类的实体类。
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("标准日志信息1:"+message);

    }
}
