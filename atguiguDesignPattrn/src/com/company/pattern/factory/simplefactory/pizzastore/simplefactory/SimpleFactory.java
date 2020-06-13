package com.company.pattern.factory.simplefactory.pizzastore.simplefactory;

import com.company.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.company.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.company.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-28 21:12
 * @description: SimpleFactory
 **/
public class SimpleFactory {

    public Pizza createPizza(String orderType){

        Pizza pizza = null;
        if ("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("greek 希腊");
        }else if ("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("cheese 奶酪");
        }
        return pizza;
    }








}
