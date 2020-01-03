package com.dyb.BuilderPattern;

/**
 * @author dyb
 * @date 2020-01-03 10:42
 * 套餐规格
 */
public class MealBuilder {
    //鸡肉套餐
    public Meal prepareVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    //素菜套餐
    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
