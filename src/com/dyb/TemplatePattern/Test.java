package com.dyb.TemplatePattern;

/**
 * @author dyb
 * @date 2020-01-10 9:50
 */
public class Test {
    public static void main(String[] args) {
        Game game=new Cricket();
        game.play();
        System.out.println();
        game=new Sandbags();
        game.play();
    }
}
