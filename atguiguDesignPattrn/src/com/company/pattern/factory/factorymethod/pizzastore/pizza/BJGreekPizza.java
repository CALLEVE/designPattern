package com.company.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:12
 * @description: bjgreekpizza
 **/
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJGreekPizza");
        System.out.println("BJGreekPizza");
    }
}
