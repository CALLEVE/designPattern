package com.company.pattern.factory.factorymethod.pizzastore.order;

import com.company.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-05-29 20:30
 * @description: 订购
 **/
public abstract class OrderPizza {

    //定义一个抽象方法，由子类去进行具体的方实现，写具体的代码逻辑
    abstract Pizza createPizza(String orderType);

    //沟通父类 构造器 实现 pizza的常规操作
    public OrderPizza() {
        Pizza pizza = null;
        //定义一个变量用于接收 pizza的类型
        String orderType = null;
        do {
            //通过 getType 获取用户输入的
            orderType = getType();
            //获取到orderType，进一步调用createPizza，得到pizza的对象，在此处可以理解
            //父类只是 提供了调用模板（甚至可以进一步向上，提炼为接口）
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        }while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
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
