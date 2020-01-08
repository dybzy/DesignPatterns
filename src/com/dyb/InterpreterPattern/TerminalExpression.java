package com.dyb.InterpreterPattern;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dyb
 * @date 2020-01-08 14:19
 * 终结符表达式
 */
public class TerminalExpression implements Expression {
    private Set<String> set=new HashSet<>();
    public TerminalExpression(String[] data){
        for (int i = 0; i <data.length ; i++) {
         set.add(data[i]);
        }

    }
    @Override
    public boolean interpret(String info) {
        if (set.contains(info)){
            return true;
        }
        return false;
    }
}
