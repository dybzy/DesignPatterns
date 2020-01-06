package com.dyb.Bridge;

/**
 * @author dyb
 * @date 2020-01-06 9:28
 * ConcreteImplementor
 */
public class Memory32G implements Memory {
    @Override
    public void addMemory() {
        System.out.println("手机内存为64G");
    }
}
