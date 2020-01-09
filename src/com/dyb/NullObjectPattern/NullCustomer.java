package com.dyb.NullObjectPattern;

/**
 * @author dyb
 * @date 2020-01-09 16:59
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public String getName() {
        return "客户数据库不可用";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
