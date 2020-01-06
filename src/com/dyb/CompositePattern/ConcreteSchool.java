package com.dyb.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-06 13:43
 */
public class ConcreteSchool implements School {
    private List<School> partList=new ArrayList<>();
    private String name;
    public  ConcreteSchool (String name){
        this.name=name;
    }
    @Override
    public void addPart(School company) {
        partList.add(company);

    }

    @Override
    public void removePart(School company) {
        partList.remove(company);
    }



    @Override
    public void action() {
        for (School school : partList) {
            school.action();
        }

    }
}
