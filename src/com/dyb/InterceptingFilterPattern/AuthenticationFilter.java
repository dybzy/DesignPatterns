package com.dyb.InterceptingFilterPattern;

/**
 * @author dyb
 * @date 2020-01-13 16:24
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("身份验证请求: " + request);
    }
}
