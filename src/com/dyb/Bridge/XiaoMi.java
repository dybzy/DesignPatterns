package com.dyb.Bridge;

/**
 * @author dyb
 * @date 2020-01-06 9:40
 */
public class XiaoMi extends Phone {
    @Override
    public void buyPhone() {
        //memory是继承自父类调用的setMemory的方法
        phoneMemory.addMemory();
        System.out.println("购买了小米手机");
    }
}
