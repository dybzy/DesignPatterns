package com.dyb.InterceptingFilterPattern;

/**
 * @author dyb
 * @date 2020-01-13 16:29
 */
public class Target {
    public void execute(String request){
        System.out.println("执行请求: " + request);
    }
}
