package com.dyb.PrototypePattern;

/**
 * @author dyb
 * @date 2020-01-03 11:07
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void drow() {
        System.out.println("Inside Rectangle::draw() method.");
    }

    
}
