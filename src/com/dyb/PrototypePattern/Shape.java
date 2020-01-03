package com.dyb.PrototypePattern;



/**
 * @author dyb
 * @date 2020-01-03 11:02
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected  String type;
    abstract void drow();
    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object  clone(){
        Object clone=null;
        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  clone;

    }

}
