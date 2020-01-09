package com.dyb.MementoPattern;

/**
 * @author dyb
 * @date 2020-01-09 9:23
 * 备忘录
 */
public class Memento {
    private String state;
    public Memento(String state){
        this.state=state;
    }
    public String getState(){
        return state;
    }
}
