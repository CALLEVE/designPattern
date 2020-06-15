package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:08
 * @description: 深焙咖啡类（一种具体的饮料）
 **/
public class DarkRoast extends Beverage {

    //应用构造函数的特性
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal(10.00);
    }
}
