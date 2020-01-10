package com.dyb.TemplatePattern;

/**
 * @author dyb
 * @date 2020-01-10 9:39
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("斗蛐蛐游戏加载完成,点击开始");
    }

    @Override
    void startPlay() {
        System.out.println("斗蛐蛐游戏正式开始,祝你玩的愉快");
    }

    @Override
    void endPlay() {
        System.out.println("游戏结束");
    }
}
