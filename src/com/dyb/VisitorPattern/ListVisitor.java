package com.dyb.VisitorPattern;

import java.util.Iterator;

/**
 * @author dyb
 * @date 2020-01-10 15:40
 */
public class ListVisitor extends Visitor {
    String currentDir = "";
    @Override
    public void visit(File file) {
        System.out.println(currentDir+"/"+file);

    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir+"/"+directory);
        String saveDir=currentDir;
        currentDir+=("/"+directory.getName());
        Iterator it=directory.iterator();
        while(it.hasNext()){
            Entry entry=(Entry)it.next();
            entry.accept(this);
        }
        currentDir=saveDir;

    }
}
