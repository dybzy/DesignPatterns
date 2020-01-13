package com.dyb.CompositeEntityPattern;

/**
 * @author dyb
 * @date 2020-01-13 14:26
 */
public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
