package com.dyb.InterceptingFilterPattern;

/**
 * @author dyb
 * @date 2020-01-13 16:25
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("请求日志: " + request);
    }
}
