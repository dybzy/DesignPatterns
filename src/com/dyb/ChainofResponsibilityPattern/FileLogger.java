package com.dyb.ChainofResponsibilityPattern;

/**
 * @author dyb
 * @date 2020-01-07 17:25
 */
public class FileLogger  extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("调试日志2:" + message);
    }
}
