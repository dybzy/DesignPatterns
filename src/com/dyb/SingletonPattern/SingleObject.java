package com.dyb.SingletonPattern;

/**
 * @author dyb
 * @date 2020-01-03 8:29
 */
public class SingleObject {
    //创建对象
    private static SingleObject instance=new SingleObject();
    //私有化构造函数
    private  SingleObject(){}
    // 对外界提供一个获取唯一可用的对象
    public   static  SingleObject getInstance(){
        return instance;
    }
    public void  showMessage(){
        System.out.println("你好");
    }
}
