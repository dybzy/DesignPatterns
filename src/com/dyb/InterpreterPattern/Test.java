package com.dyb.InterpreterPattern;

/**
 * @author dyb
 * @date 2020-01-08 14:40
 */
public class Test {
    public static void main(String[] args) {
        Context bus=new Context();
        bus.freeRide("深圳的老人");
        bus.freeRide("上海的年轻人");
        bus.freeRide("北京的妇女");
        bus.freeRide("广州的小孩");
    }
}
