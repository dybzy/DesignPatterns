package com.dyb.InterceptingFilterPattern;

/**
 * @author dyb
 * @date 2020-01-13 16:36
 */
public class Test {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
