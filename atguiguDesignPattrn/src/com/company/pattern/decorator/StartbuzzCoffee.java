package com.company.pattern.decorator;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 23:00
 * @description: 咖啡店
 **/
public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.description+":"+beverage.cost());

        //试试添加其他的东西
        Beverage espresso = new Espresso();
        //注意只是调整了引用，对象是实际存在的东西
        //通过如下的方式，espresso的本质还是饮料
        espresso = new WhipDecorator(espresso);
        System.out.println(espresso.getDescription()+":"+espresso.cost());
    }
}
