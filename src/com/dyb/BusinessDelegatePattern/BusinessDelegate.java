package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 11:13
 * 业务代表
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService=new BusinessLookUp();
    private BusinessService  businessService ;
    private String serviceType;
    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
