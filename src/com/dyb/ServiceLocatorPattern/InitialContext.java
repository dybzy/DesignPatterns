package com.dyb.ServiceLocatorPattern;

/**
 * @author dyb
 * @date 2020-01-13 17:10
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("查找并创建一个新的Service1对象");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("查找并创建一个新的Service2对象");
            return new Service2();
        }
        return null;
    }
}
