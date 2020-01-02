package com.dyb.FactoryPattern;

/**
 * @author dyb
 * @date 2020-01-02 14:38
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("di")){
            return new ShapeImpl();
        }
        if (shapeType.equalsIgnoreCase("shu")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("zhang")){
            return new Circle();
        }
        return null;
    }
}
