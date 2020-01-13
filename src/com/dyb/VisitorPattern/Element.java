package com.dyb.VisitorPattern;

/**
 * @author dyb
 * @date 2020-01-10 15:15
 */
public interface Element {
    public  abstract  void accept(Visitor visitor);
}
