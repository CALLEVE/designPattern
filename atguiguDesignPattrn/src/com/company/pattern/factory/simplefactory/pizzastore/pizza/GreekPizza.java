package com.company.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-28 19:49
 * @description: Greek
 **/
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备希腊pizza");
    }
}
