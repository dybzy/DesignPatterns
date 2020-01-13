package com.dyb.ServiceLocatorPattern;

/**
 * @author dyb
 * @date 2020-01-13 17:14
 */
public class Text {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
