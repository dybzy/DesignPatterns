package com.dyb.ChainofResponsibilityPattern;

/**
 * @author dyb
 * @date 2020-01-07 17:26
 */
public class Test {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "这是一个标准信息");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "这是一个调试级别信息");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "这是一个错误级别信息");

    }
}
