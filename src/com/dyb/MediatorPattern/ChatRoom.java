package com.dyb.MediatorPattern;

import java.util.Date;

/**
 * @author dyb
 * @date 2020-01-09 9:01
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
