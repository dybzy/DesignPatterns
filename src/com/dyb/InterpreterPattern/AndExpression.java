package com.dyb.InterpreterPattern;

/**
 * @author dyb
 * @date 2020-01-08 14:28
 *
 * 非终结符表达式类
 */
public class AndExpression implements Expression {
    private Expression city = null;
    private Expression person = null;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    //非对终结符表达式的处理
    @Override
    public boolean interpret(String info) {
        String s[] = info.split("的");
        //判断city是否包含存入的信息 && person是否包含存入的信息
        return city.interpret(s[0]) && person.interpret(s[1]);
    }


}
