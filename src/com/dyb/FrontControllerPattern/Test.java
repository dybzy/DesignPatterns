package com.dyb.FrontControllerPattern;

/**
 * @author dyb
 * @date 2020-01-13 15:55
 */
public class Test {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
