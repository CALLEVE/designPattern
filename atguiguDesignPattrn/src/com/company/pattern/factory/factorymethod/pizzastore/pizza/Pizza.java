package com.company.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:07
 * @description: Pizza
 **/
public abstract class Pizza {

    protected  String name;
    //准备原材料
    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking");
    }

    public void cut(){
        System.out.println(name+"cutting");
    }

    public void box(){
        System.out.println(name+"boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
