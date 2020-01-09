package com.dyb.StatePattern;

/**
 * @author dyb
 * @date 2020-01-09 15:27
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("玩家处于开始状态");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "起始状态";
    }
}
