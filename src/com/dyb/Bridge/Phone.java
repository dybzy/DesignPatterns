package com.dyb.Bridge;

/**
 * @author dyb
 * @date 2020-01-06 9:31
 * Abstraction
 */
public abstract class Phone {
    public  Memory phoneMemory;
    public void setPhoneMemory(Memory memory){
        this.phoneMemory=memory;
    }
    public abstract  void buyPhone();
}
