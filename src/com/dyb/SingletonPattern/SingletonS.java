package com.dyb.SingletonPattern;

/**
 * @author dyb
 * @date 2020-01-03 8:52
 * 双检锁/双重校验锁
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 */
public class SingletonS {
    private volatile static SingletonS singletonS;
    private SingletonS(){};
    public static SingletonS getInstance(){
        if (singletonS==null){
            synchronized (SingletonS.class){
                if(singletonS==null){
                    singletonS=new SingletonS();
                }
            }
        }
        return singletonS;
    }
}
