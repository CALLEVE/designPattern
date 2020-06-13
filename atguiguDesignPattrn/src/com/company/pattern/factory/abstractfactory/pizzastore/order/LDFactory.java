package com.company.pattern.factory.abstractfactory.pizzastore.order;

import com.company.pattern.factory.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.company.pattern.factory.abstractfactory.pizzastore.pizza.LDGreekPizza;
import com.company.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-30 16:45
 * @description: 伦敦工厂
 **/
public class LDFactory implements AbstractFactory {
    @Override
    public Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if (orderType != null) {
            if ("cheese".equals(orderType)) {
                pizza = new LDCheesePizza();
            }else if ("greek".equals(orderType)){
                pizza = new LDGreekPizza();
            }
        }
        return pizza;
    }
}
