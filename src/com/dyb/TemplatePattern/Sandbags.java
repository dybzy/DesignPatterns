package com.dyb.TemplatePattern;

/**
 * @author dyb
 * @date 2020-01-10 9:43
 */
public class Sandbags extends Game {
    @Override
    void initialize() {
        System.out.println("丢沙包游戏初始化完成,请点击开始");
    }

    @Override
    void startPlay() {
        System.out.println("丢沙包游戏正式开始");

    }

    @Override
    void endPlay() {
        System.out.println("丢沙包游戏结束");

    }
}
