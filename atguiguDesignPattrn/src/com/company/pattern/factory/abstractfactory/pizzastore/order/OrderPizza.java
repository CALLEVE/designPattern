package com.company.pattern.factory.abstractfactory.pizzastore.order;

import com.company.pattern.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-30 16:51
 * @description: 订购pizza
 * 此部分就是个对外平台，通过你要指定那个工厂来生产产品
 * 1。属性中包含有AbstractFactory
 * 2。
 * 3。
 *
 *
 **/
public class OrderPizza {

    public OrderPizza(AbstractFactory factory) {
        //实现可重复订单的功能
        String orderType = null;

        do {
            orderType = getType();
            Pizza pizza = factory.creatPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("订购失败");
                break;
            }
        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
