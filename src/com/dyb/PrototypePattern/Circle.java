package com.dyb.PrototypePattern;

/**
 * @author dyb
 * @date 2020-01-03 11:12
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void drow() {
        System.out.println("Inside Circle::draw() method.");
    }
}
