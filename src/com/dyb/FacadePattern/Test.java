package com.dyb.FacadePattern;

/**
 * @author dyb
 * @date 2020-01-06 16:01
 */
public class Test {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
