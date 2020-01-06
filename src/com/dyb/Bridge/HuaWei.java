package com.dyb.Bridge;

/**
 * @author dyb
 * @date 2020-01-06 9:35
 * Refined Abstraction
 */
public class HuaWei extends Phone {
    @Override
    public void buyPhone() {
        //memory是继承自父类调用的setMemory的方法
        phoneMemory.addMemory();
        System.out.println("购买了华为手机");
    }
}
