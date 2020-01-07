package com.dyb.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dyb
 * @date 2020-01-07 8:44
 * 享元工厂
 */
public class Llibrary {
    //图书馆维护一个图书列表
    private Map<String ,Book> bookpools=new HashMap<String ,Book>();
    private static Llibrary factory=new Llibrary();
    //图书馆只有一个
    public static Llibrary getInstance() {
        return factory;
    }
    public Book libToBorrow(String bookName){
        Book order=null;
        //如果书架有,直接借出
        if(bookpools.containsKey(bookName)){
            order=bookpools.get(bookName);
        }
        //如果书架没有,那就调进来一本新书
        else {
            order=new ConcreteBook(bookName);
            bookpools.put(bookName,order);
        }

        return order;
    }
    public  int getAllBookSize(){
            return bookpools.size();
    }
}
