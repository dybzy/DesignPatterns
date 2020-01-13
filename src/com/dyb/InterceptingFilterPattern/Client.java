package com.dyb.InterceptingFilterPattern;

/**
 * @author dyb
 * @date 2020-01-13 16:36
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
