package com.company.pattern.decorator;

import java.math.BigDecimal;

/**
 * @program: atguiguDesignPattrn
 * @author: wangjinpeng
 * @create: 2020-06-13 22:30
 * @description: 低咖啡因咖啡类（一种具体的饮料）
 **/
public class Decaf extends Beverage{

    public Decaf() {
        description = "Decaf";
    }

    @Override
    protected BigDecimal cost() {
        return new BigDecimal("15.00");
    }
}
