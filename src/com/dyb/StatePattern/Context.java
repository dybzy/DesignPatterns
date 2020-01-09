package com.dyb.StatePattern;

/**
 * @author dyb
 * @date 2020-01-09 15:24
 * 带有状态的类1
 *
 */
public class Context {
    private State state;

    public Context(){
        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
