package com.dyb.ProxyPattern.jdkPP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author dyb
 * @date 2020-01-07 15:59
 * 首先实现InvocationHandler
 */
public class MyInvocationHandle implements InvocationHandler {
    private  Object target;
    public void  setTarget(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtils.method1();
        method.invoke(target, args);
        DogUtils.method2();
        return null;
    }
}
