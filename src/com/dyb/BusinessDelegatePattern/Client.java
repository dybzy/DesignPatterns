package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 13:32
 */
public class Client {
    BusinessDelegate businessService;
    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }
    public void doTask(){
        businessService.doTask();
    }
}
