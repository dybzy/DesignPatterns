package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 11:10
 * 实体服务类
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("通过调用EJB服务处理任务");
    }
}
