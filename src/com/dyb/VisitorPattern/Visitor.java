package com.dyb.VisitorPattern;

/**
 * @author dyb
 * @date 2020-01-10 15:16
 * 访问者
 */
public abstract  class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
