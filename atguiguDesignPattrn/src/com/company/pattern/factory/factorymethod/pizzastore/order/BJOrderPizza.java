package com.company.pattern.factory.factorymethod.pizzastore.order;

import com.company.pattern.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.company.pattern.factory.factorymethod.pizzastore.pizza.BJGreekPizza;
import com.company.pattern.factory.factorymethod.pizzastore.pizza.Pizza;


/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:30
 * @description: BJStore
 **/
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
            Pizza pizza = null;
            if("greek".equals(orderType)){
                pizza = new BJGreekPizza();
            }else if("cheese".equals(orderType)){
                pizza = new BJCheesePizza();
            }
        return pizza;
    }
}
