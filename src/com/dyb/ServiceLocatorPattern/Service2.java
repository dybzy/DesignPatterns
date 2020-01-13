package com.dyb.ServiceLocatorPattern;

/**
 * @author dyb
 * @date 2020-01-13 17:09
 */
public class Service2 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}