package com.dyb.CommandPattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author dyb
 * @date 2020-01-08 10:29
 * 命令集
 */
public class MacroCommand implements Command {
    //创建一个栈
    Stack commands=new Stack();
    //遍历栈


    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()){
            Command command=(Command)it.next();
            command.execute();

        }
    }
    //在栈内添加命令行
    public void append(Command command){
        if(command!=this){
            commands.add(command);
        }
    }
    //清空栈
    public void clear(){
        commands.clear();
    }
    //取消栈
    public void undo(){
        if(!commands.isEmpty()){
            commands.pop();
        }
    }

}
