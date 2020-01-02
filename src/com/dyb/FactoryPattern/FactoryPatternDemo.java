package com.dyb.FactoryPattern;

/**
 * @author dyb
 * @date 2020-01-02 14:44
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 ShapeImpl 的对象，并调用它的 draw 方法
        Shape di = shapeFactory.getShape("di");
        //调用 ShapeImpl 的 draw 方法
        di.draw();
        Shape shu = shapeFactory.getShape("shu");
        shu.draw();
        Shape zhang = shapeFactory.getShape("zhang");
        zhang.draw();
    }
}
