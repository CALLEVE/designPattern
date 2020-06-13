package com.company.pattern.factory.simplefactory.pizzastore.order;

import com.company.pattern.factory.simplefactory.pizzastore.pizza.Pizza;
import com.company.pattern.factory.simplefactory.pizzastore.simplefactory.SimpleFactory;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-28 20:14
 * @description: PizzaOrder
 **/
public class PizzaStroe {
    public static void main(String[] args) {
//        new OrderPizza();

        // pizza开始订购pizza
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序...");

    }
}
