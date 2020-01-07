package com.dyb.FlyweightPattern;

/**
 * @author dyb
 * @date 2020-01-07 8:40
 * 定义具体享元类
 */
public class ConcreteBook  implements Book{
    private String name;
    public ConcreteBook(String name){
        this.name=name;
    }
    @Override
    public void borrow() {
        System.out.println("图书馆借出一本书,书名为:"+this.name);
    }
}
