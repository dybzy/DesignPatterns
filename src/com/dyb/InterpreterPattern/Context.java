package com.dyb.InterpreterPattern;

/**
 * @author dyb
 * @date 2020-01-08 14:30
 * 环境类
 */
public class Context {
    private String[] citys = { "上海", "北京", "广州", "深圳" };
    private String[] persons = { "老人", "小孩", "残疾人", "孕妇" };
    private Expression expression=null;
    public Context(){
        Expression city=new TerminalExpression(citys);
        Expression person=new TerminalExpression(persons);
        expression=new AndExpression(city,person);
    }
    //调用相关表达式的解释方法
    public void freeRide(String info){
        boolean ok = expression.interpret(info);
        if(ok){
            System.out.println("您是"+info+",您本次乘车免费");
        }else {
            System.out.println(info+",您不是免费人员,本次乘车扣费2元");
        }
    }
}
