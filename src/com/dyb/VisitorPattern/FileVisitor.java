package com.dyb.VisitorPattern;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author dyb
 * @date 2020-01-10 15:49
 */
public class FileVisitor extends Visitor {

    String currentDir = "";
    String suffix;
    ArrayList files=new ArrayList();

    public FileVisitor(String suffix){
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        if(file.getName().endsWith(suffix)){
            // System.out.println(currentDir+"/"+file);
            files.add(currentDir+"/"+file);
        }
    }
    @Override
    public void visit(Directory directory) {
        String saveDir=currentDir;
        currentDir+=("/"+directory.getName());
        Iterator it=directory.iterator();
        while(it.hasNext()){
            Entry entry=(Entry)it.next();
            entry.accept(this);
        }
        currentDir=saveDir;
    }
    Iterator getFiles(){
        return files.iterator();
    }

}
