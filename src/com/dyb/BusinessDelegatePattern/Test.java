package com.dyb.BusinessDelegatePattern;

/**
 * @author dyb
 * @date 2020-01-13 13:35
 */
public class Test {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate=new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client=new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
