package com.company.pattern.factory.abstractfactory.pizzastore.order;

import com.company.pattern.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import com.company.pattern.factory.abstractfactory.pizzastore.pizza.BJGreekPizza;
import com.company.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-30 16:45
 * @description: 北京工厂
 **/
public class BJFactory implements AbstractFactory {
    @Override
    public Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if (orderType != null) {
            if ("cheese".equals(orderType)) {
                pizza = new BJCheesePizza();
            } else if ("greek".equals(orderType)) {
                pizza = new BJGreekPizza();
            }
        }
        return pizza;
    }
}
