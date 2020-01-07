package com.dyb.ProxyPattern;

/**
 * @author dyb
 * @date 2020-01-07 10:38
 * 代理类
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
