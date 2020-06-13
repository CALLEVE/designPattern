package com.company.pattern.factory.factorymethod.pizzastore.order;

import com.company.pattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.company.pattern.factory.factorymethod.pizzastore.pizza.LDGreekPizza;
import com.company.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:30
 * @description: LDStore
 **/
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("greek".equals(orderType)){
            pizza = new LDGreekPizza();
        }
        return pizza;
    }
}
