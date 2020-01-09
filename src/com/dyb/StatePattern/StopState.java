package com.dyb.StatePattern;

/**
 * @author dyb
 * @date 2020-01-09 15:30
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("玩家处于停止状态");
        context.setState(this);
    }
    @Override
    public String toString(){
        return "停止状态";
    }
}
