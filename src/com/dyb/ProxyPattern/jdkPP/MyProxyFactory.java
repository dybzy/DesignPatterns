package com.dyb.ProxyPattern.jdkPP;

import java.lang.reflect.Proxy;

/**
 * @author dyb
 * @date 2020-01-07 16:09
 * 生产代理对象的工厂
 */
public class MyProxyFactory {
    public static Object getPrXy(Object target){
     MyInvocationHandle  handle=new MyInvocationHandle();
     handle.setTarget(target);
     Object proxy= Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handle);
     return proxy;
     }

}
