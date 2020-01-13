package com.dyb.VisitorPattern;

import java.util.Iterator;

/**
 * @author dyb
 * @date 2020-01-10 15:18
 * 入口
 */
public abstract class Entry implements Element {
   public abstract String getName();
   public abstract int getSize();
   public  abstract void  printList(String prefix);
   private void printList(){
       printList("");
   }
   public Entry add(Element element) throws RuntimeException{
       throw new RuntimeException();
   }
   public Iterator iterator() throws RuntimeException{
       throw new RuntimeException();
    }
    @Override
    public String toString(){
        return getName()+"<"+getSize()+">";
    }
}
