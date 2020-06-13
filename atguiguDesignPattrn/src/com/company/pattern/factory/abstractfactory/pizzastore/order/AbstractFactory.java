package com.company.pattern.factory.abstractfactory.pizzastore.order;

import com.company.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

public interface AbstractFactory {

    //有实现类完成具体的实现
    Pizza creatPizza(String orderType);

}
