package com.dyb.MediatorPattern;

/**
 * @author dyb
 * @date 2020-01-09 9:02
 */
public class Text {
    public static void main(String[] args) {
        User robert = new User("小红");
        User john = new User("小明");

        robert.sendMessage("吃了吗,小明");
        john.sendMessage("吃了,你那");
    }
}
