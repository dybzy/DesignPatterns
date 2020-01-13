package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 11:11
 */
public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("通过调用JMS服务处理任务");
    }
}
