package com.dyb.NullObjectPattern;

/**
 * @author dyb
 * @date 2020-01-09 16:59
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
