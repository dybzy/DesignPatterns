package com.dyb.CompositeEntityPattern;

/**
 * @author dyb
 * @date 2020-01-13 14:21
 * 组合实体
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
