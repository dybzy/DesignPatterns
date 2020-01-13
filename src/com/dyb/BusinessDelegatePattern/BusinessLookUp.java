package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 11:11
 * 业务查询服务
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
