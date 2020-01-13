package com.dyb.FrontControllerPattern;

/**
 * @author dyb
 * @date 2020-01-13 15:54
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("成功认证用户.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("页面请求: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
