package com.company.pattern.factory.factorymethod.pizzastore.pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:13
 * @description: BJCheesePizza
 **/
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        this.setName("BJCheesePizza");
        System.out.println("BJCheesePizza");
    }
}
