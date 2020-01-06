package com.dyb.CompositePattern;

/**
 * @author dyb
 * @date 2020-01-06 13:56
 */
public class SecurtyDepartment implements School{
    private String name;
    public SecurtyDepartment(String name){
        this.name=name;
    }
    @Override
    public void addPart(School company) {

    }

    @Override
    public void removePart(School company) {

    }


    @Override
    public void action() {
        System.out.println("我是"+name+"负责学校的安全工作");
    }
}
