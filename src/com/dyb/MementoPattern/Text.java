package com.dyb.MementoPattern;

/**
 * @author dyb
 * @date 2020-01-09 10:13
 */
public class Text {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();
        originator.setState("状态 #1");
        originator.setState("状态 #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态 #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("状态 #4");
        System.out.println("现在状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(careTaker.get(0));
        System.out.println("第一次保存状态: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("第二次保存: " + originator.getState());
    }
}
