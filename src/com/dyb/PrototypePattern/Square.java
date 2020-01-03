package com.dyb.PrototypePattern;

/**
 * @author dyb
 * @date 2020-01-03 11:10
 */
public class Square  extends Shape  {
    public Square(){
        type = "Square";
    }

    @Override
    public void drow() {
        System.out.println("Inside Square::draw() method.");
    }
}
