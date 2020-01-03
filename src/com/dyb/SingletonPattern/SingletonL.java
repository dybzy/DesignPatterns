package com.dyb.SingletonPattern;

/**
 * @author dyb
 * @date 2020-01-03 8:39
 * 懒汉式
 * 描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 */

public class SingletonL {
    private static SingletonL intance;
    private  SingletonL (){}
    public static synchronized  SingletonL getInstance(){
        if(intance==null){
            intance=new SingletonL();
        }
        return intance;
    }


}
