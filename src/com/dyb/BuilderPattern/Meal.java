package com.dyb.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dyb
 * @date 2020-01-03 10:23
 * 订餐模型
 */
public class Meal {
    private List<Item> items =new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        Float cost=0.0f;
        for (Item item : items) {
            cost+=item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items) {
            System.out.println("食物:"+item.name());
            System.out.println(",包装:"+item.packing().pack());
            System.out.println(",价格:"+item.price());
        }
    }
}
