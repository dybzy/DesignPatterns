package com.dyb.VisitorPattern;

/**
 * @author dyb
 * @date 2020-01-10 15:25
 */
public class File extends Entry {
    private String name;
    private int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
