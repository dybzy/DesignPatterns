package com.dyb.VisitorPattern;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author dyb
 * @date 2020-01-10 15:30
 * 路径
 */
public class Directory extends Entry {
    String name;
    ArrayList entrys=new ArrayList();
    public Directory(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator it=entrys.iterator();
        while(it.hasNext()){
            size+=((Entry)it.next()).getSize();
        }
        return size;
    }

    public Entry add(Entry entry){
        entrys.add(entry);
        return this;
    }
    @Override
    public Iterator iterator() {
        return entrys.iterator();
    }



    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator iterator = entrys.iterator();
        Entry entry;
        while (iterator.hasNext()){
            entry=(Entry)iterator.next();
            entry.printList(prefix+"/"+name);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
