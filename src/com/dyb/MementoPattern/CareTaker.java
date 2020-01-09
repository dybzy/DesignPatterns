package com.dyb.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-09 9:54
 * 保存类
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
